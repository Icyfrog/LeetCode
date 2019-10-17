## [题目](https://leetcode-cn.com/problems/two-sum/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china)
## 

1. 直接暴力解法，两重循环，效率一般
2. [链接](https://blog.csdn.net/SoulOH/article/details/81017361) 用Hash表**根据key来查value的时间复杂度为O1**，来提升代码效率.
3. 同时注意到，找到3、5和找到5、3效果是一样的，所以完全可以将数组哈希和查询遍历放在同一个循环内，又节省了时间。
4. 如果数组中有重复的，会不会hash表中会不会覆盖，或是新增一个键值对呢？其实这个题目根本不用考虑hash表是否会重复！因为两个下标，一个是从循环计数器i中拿到的，一个是从哈希表的key中拿到的。
5. 问题页面旁边也有官方答案的。