package rezin;

import java.util.*;

/**
 * 유저에게 추천할 코믹 작품 목록을 추천시스템으로부터 장르별로 받아왔다고 가정합니다.
 * 각 장르별 추천 작품들은 아래와 같다고 할 때,
 * - 스포츠 : s1, s2, s3
 * - 개그: g1, g2
 * - 판타지: f1, f2, f3
 * 이 총 8개의 추천 작품들을 장르 순서가 서로 겹치지 않게 나열해서 보여주려고 합니다.
 * 예를 들어, 결과가 s1, g1, f1, s2, g2, f2, s3, f3 이렇게 다음 추천 작품의 장르가 바로 직전
 * 추천 작품의 장르와 다르게 골고루 나오게 하고 싶습니다.
 * (s1, s2와 같이 동일 장르의 두 작품이 연달아 나오지 않아야 합니다.)
 * 이 문제를 실행할 수 있는 코드를 작성해주세요.
 * <p>
 * 예제1)
 * sports,s1,s2,s3
 * gag,g1,g2
 * fantasy,f1,f2,f3
 * 결과)
 * s1,g1,f1,s2,g2,f2,s3,f3
 * <p>
 * 예제2)
 * sports,s1,s2,s3
 * gag,g1,g2
 * fantasy,f1,f2,f3,f4
 * 결과)
 * f1,s1,g1,f2,s2,g2,f3,s3,f4
 */
public class Test1 {

	private static final String LF = "\n";

	private String getDataFromRecommendationApi() {
		//String data = "sports,s1,s2,s3\ngag,g1,g2\nfantasy,f1,f2,f3";
		String data = "sports,s1,s2,s3,s4\ngag,g1,g2\nfantasy,f1,f2,f3,f4,f5";
		return data;
	}

	private List<Queue<String>> getQueuesAfterParsingData(String data) {
		StringTokenizer tokenizer = new StringTokenizer(data, LF);
		List<Queue<String>> queues = new ArrayList<>();
		while (tokenizer.hasMoreTokens()) {
			String line = tokenizer.nextToken().trim();
			String[] names = line.split(",");
			names = Arrays.copyOfRange(names, 1, names.length); // sports, gag, fantasy 앞자리 헤더 토큰 제거
			Queue<String> queue = new LinkedList<>();
			queue.addAll(Arrays.asList(names));
			queues.add(queue);
		}
		return queues;
	}

	private void printRecommendations(String data) throws Exception {
		if (data == null || data.trim().length() == 0) {
			throw new Exception();
		}
		// 데이터는 행별로 장르가 구분되어 제공됨.
		List<Queue<String>> queues = getQueuesAfterParsingData(data);

		int curLineIdx = 0;
		List<String> recommendations = new ArrayList<>();
		while (queues.size() != 0) {
			Queue<String> queue = queues.get(curLineIdx);
			if (queue.size() == 0) {
				queues.remove(queue);
				curLineIdx = 0;
				continue;
			}
			if (curLineIdx == queues.size() - 1 || queues.size() == 1) {
				curLineIdx = 0;
			} else {
				curLineIdx++;
			}
			String recommendation = queue.poll();
			if (recommendation == null || recommendation.trim().length() == 0) {
				continue;
			}
			recommendations.add(recommendation);
		}

		System.out.println(String.join(",", recommendations));
	}

	public static void main(String[] args) throws Exception {
		Test1 test = new Test1();
		// connect API
		// do authorization
		// fetch data from API
		String data = test.getDataFromRecommendationApi();
		test.printRecommendations(data);
	}
}