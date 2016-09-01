# sensitivewd-filter
具体通过实现DFA算法实现对敏感词、广告词的过滤功能：<br/><br/>
 1、匹配大小写过滤<br/>
 2、匹配全角半角过滤<br/>
 3、匹配过滤停顿词过滤。<br/><br/>
 
其中resources资源目录中：<br/>
stopwd.txt ：停顿词，匹配时间直接过滤。<br/>
wd.txt：敏感词库。<br/><br/>


WordFilter为敏感词过滤类，有如下方法：<br/><br/>

isContains() ：是否包含敏感词<br/>
doFilter()：过滤敏感词<br/>

测试结果：<br/><br/>

解析文字：法@@!轮!　　功<br/><br/>
解析字数 : 9<br/>
加载时间 : 12953998ns<br/>
加载时间 : 12ms <br/>
解析时间 : 15584375ns <br/>
解析时间 : 15ms <br/>
************<br/><br/>


是否包含敏感词： true <br/>
解析时间 : 92783ns <br/>
解析时间 : 0ms <br/><br/>

支持如下类型类型过滤检测：<br/>
fuck 全小写<br/>
FuCk 大小写<br/>
ｆｕｃｋ全角半角<br/>
f!!!u&c  ###k 停顿词<br/>
fffuuuucccckkk 重复词<br/><br/><br/>

博文地址：http://blog.csdn.net/fengshizty/article/details/52373005<br/>
