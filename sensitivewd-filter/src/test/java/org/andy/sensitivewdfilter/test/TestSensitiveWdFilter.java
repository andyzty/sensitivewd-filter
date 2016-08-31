package org.andy.sensitivewdfilter.test;

import org.andy.sensitivewdfilter.WordFilter;
import org.junit.Test;

/**
 * 创建时间：2016年8月30日 下午5:12:40
 * 
 * @author andy
 * @version 2.2
 */

public class TestSensitiveWdFilter {

	@Test
	public void TestFilter() {
		String s = "你是逗比吗？ｆｕｃｋ！fUcK,你竟然用法轮功，法@!轮!%%%功";
		System.out.println("解析问题： " + s);
		System.out.println("解析字数 : " + s.length());
		String re;
		long nano = System.nanoTime();
		re = WordFilter.doFilter(s);
		nano = (System.nanoTime() - nano);
		System.out.println("解析时间 : " + nano + "ns");
		System.out.println("解析时间 : " + nano / 1000000 + "ms");
		System.out.println(re);
		System.out.println();

		nano = System.nanoTime();
		System.out.println("是否包含敏感词： " + WordFilter.isContains(s));
		nano = (System.nanoTime() - nano);
		System.out.println("解析时间 : " + nano + "ns");
		System.out.println("解析时间 : " + nano / 1000000 + "ms");
	}
}
