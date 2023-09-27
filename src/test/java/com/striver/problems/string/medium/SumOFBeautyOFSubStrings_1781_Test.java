package com.striver.problems.string.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOFBeautyOFSubStrings_1781_Test {
	SumOFBeautyOFSubStrings_1781 s  = new SumOFBeautyOFSubStrings_1781();
	
	@Test
	public void test1() {
		assertEquals(614258, s.beautySum("hiwhhrjugmpnyxzrvyxsuxeeqaecyasqdfbotrdtcglquuylygbziiaumetxklicurowfagiwgistkufvotosttvodnfknzlznorvhxqpekbraeiwiwlaleyjmzeakxxgplpophojiaiatrrjdhjbuevrjejbvsugfjjwhuiytidvujyrrchelwixarxokgwlyjaapxywseocyxvtnlagvlhwkqkatimwuetmmkgcxacmjwnybwkwbzgfauudkxejbtnndywxlswllgatfyyyafcqhbmmlmmsstosvgyqlnwqbfobztftqnsfqbwzgrdsihhzdcutypzcoiroyngtmryhjvdbluoebyxlwbrwlyqeeirpdwutahhybnkgbhlehnagtlnpeioooqhrjjjjjj"));
	}
	
	@Test
	public void test2() {
		assertEquals(5, s.beautySum("aabcb"));
	}
	
	@Test
	public void test3() {
		assertEquals(17, s.beautySum("aabcbaa"));
	}
	
	@Test
	public void test4() {
		assertEquals(31, s.beautySum("dsppsjfbxdwkqe"));
	}
	
	@Test
	public void test5() {
		assertEquals(2, s.beautySum("spps"));
	}

}
