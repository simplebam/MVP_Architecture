# MVP_Architecture

该项目是模仿吴小龙同学的AndroidMVPSample:[WuXiaolong/AndroidMVPSample: Android MVP + Retrofit + RxJava2 实例 ](https://github.com/WuXiaolong/AndroidMVPSample)
推荐文章:[一个基于Android的MVP框架Demo - 掘金 ](https://juejin.im/post/5acf0e84518825555e5e39eb)


## 项目简介
* 利用MVP框架简单获取中国天气网的数据
* module "MVP-Old" 主要利用 android-async-http 联网框架,对应:[Android MVP 实例 | 吴小龙同學 ](http://wuxiaolong.me/2015/09/23/AndroidMVPSample/)
* module "app" 主要利用 Retrofit/OkHttp 联网框架:[WuXiaolong/AndroidMVPSample: Android MVP + Retrofit + RxJava2 实例 ](https://github.com/WuXiaolong/AndroidMVPSample)


### 项目截图
<a href="./art/MVP_old.jpg"><img src="./art/MVP_old.jpg" width="20%"/></a><img height="0" width="8px"/><a href="./art/MVP_new.jpg"><img src="./art/MVP_new.jpg" width="20%"/></a>

App体验链接:


### 项目中用到的知识
* 命名规范-这里主要参考Blankj:[Android 开发规范（完结版） - 简书](https://www.jianshu.com/p/45c1675bec69)
* Android基础:
  * Android基础知识复习:[尚硅谷15天Android基础(复习笔记) - CSDN博客](http://blog.csdn.net/simplebam/article/details/70213167)
  * 四大组件:
     * Activity:
        * 启动模式:[Activity的四种启动模式-图文并茂 – Android开发中文站](http://www.androidchina.net/3173.html)
        * 状态保存与恢复:[Android Activity 和 Fragment 状态保存与恢复的最佳实践](https://www.jianshu.com/p/45cc7775a44b)
        * 动画切换:[酷炫的Activity切换动画，打造更好的用户体验 - 简书](https://www.jianshu.com/p/37e94f8b6f59)
        * 标签属性:[Android Activity标签属性 - 简书](https://www.jianshu.com/p/8598825222cc)
     * PreferenceActivity:
        * [Android开发之PreferenceActivity的使用 - 简书](https://www.jianshu.com/p/4a65f4a912c6)
        * [Preference 三种监听事件说明 - wangjicong_215的博客 - CSDN博客](http://blog.csdn.net/wangjicong_215/article/details/52209380)
     * Fragment
        * [实现Activity和Fragment之前通信 - CSDN博客](http://blog.csdn.net/xuxian361/article/details/75529810)
        * [死磕 Fragment 的生命周期 - MeloDev的博客 - CSDN博客](http://blog.csdn.net/MeloDev/article/details/53406019)
        * [android fragment onHiddenChanged的使用 - CSDN博客](http://blog.csdn.net/bzlj2912009596/article/details/62851537)
           ,这里是为了解释第二篇博文准备的
        * [Fragment的setUserVisibleHint方法实现懒加载，但
          setUserVisibleHint 不起作用？ - Leevey·L - 博客园](http://www.cnblogs.com/leevey/p/5678037.html)
          ,这里是为了解释第二篇博文准备的
        * [TabLayout使用详解 - 简书](https://www.jianshu.com/p/7f79b08f5afa)
          ,这里是为了解释第二篇博文准备的
        * [套在ViewPagerz中的Fragment在各种状态下的生命周期 - CSDN博客](http://blog.csdn.net/jemenchen/article/details/52645380)
        * [Android -- Fragment 基本用法、生命周期与细节注意 - 简书](https://www.jianshu.com/p/1ff18ec1fb6b)
        * [Fragment全解析系列（一）：那些年踩过的坑 - 简书](https://www.jianshu.com/p/d9143a92ad94)
          ,这系列的四篇都很经典,建议你可以看看
        * 还不知道怎么入门解析Fragment的可以看我的面经,里面涉及了(卖个广告),
          [Android面经-基础篇(持续更新...) - CSDN博客](http://blog.csdn.net/simplebam/article/details/77989675)
        * 关于保存和恢复Fragment目前最正确的状态:[The Real Best Practices to Save/Restore Activity's and Fragment's state. (StatedFragment is now deprecated)](https://inthecheesefactory.com/blog/fragment-state-saving-best-practices/en)
  * Material Design:
    * [Android Theme.AppCompat 中，你应该熟悉的颜色属性 - 简书 ](https://www.jianshu.com/p/15c6397685a0)
      这家伙的关于MD文章也是值得一看的,简短but精辟
    * Toolbar:
        * [ToolBar使用心得(如何改变item的位置) - 泡在网上的日子](http://www.jcodecraeer.com/plus/view.php?aid=7667)
        * [Toolbar+DrawerLayout+NavigationView使用心得](http://www.jcodecraeer.com/a/anzhuokaifa/2017/0317/7694.html)
        * [Android ToolBar 使用完全解析 - 简书]( https://www.jianshu.com/p/ae0013a4f71a)
    * CoordinatorLayout(本身就是一个加强版的FrameLayout)可以监听其所有子控件
      的各种事件,然后自动帮助我们做出最为最为合理的响应 <--(寄生) AppBarLayout
      (垂直的LinearLayout加强版),它在内部做了很多滚动事件的封装
      <--(寄生) CollapsingToolBarLayout(可折叠式标题栏)
        * CoordinatorLayout:[CoordinatorLayout与滚动的处理-泡在网上的日子](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0717/3196.html)
        * DrawLayout:
          * [android官方侧滑菜单DrawerLayout详解 - 泡在网上的日子](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/0925/1713.html)
          * [用Android自带的DrawerLayout和ActionBarDrawerToggle实现侧滑效
            果 - CSDN博客](http://blog.csdn.net/miyuexingchen/article/details/52232751)
          * [Drawer 详解 ·Material Design Part 3 - Android - 掘金](https://juejin.im/entry/5825c76d67f3560058d23657)
    * RecyclerView:
        * [RecyclerView简单使用总结 - 简书](https://www.jianshu.com/p/9b3949f7cb0f)
        * [RecyclerView使用完全指南，是时候体验新控件了（一） - 简书](https://www.jianshu.com/p/4fc6164e4709)
    * SwipeRefreshLayout:
        * [SwipeRefreshLayout详解和自定义上拉加载更多 - 简书 ](https://www.jianshu.com/p/d23b42b6360b)
        * [SwipeRefreshLayout+RecyclerView冲突的几种解决方案 - 简书](https://www.jianshu.com/p/34cbaddb668b)
    * 看不懂物料设计的话建议买郭霖先生的《第二行代码》好一点，这本书内容对于初级
      开发者来说还是蛮不错的
  * 异步消息机制:[Android异步消息处理机制完全解析，带你从源码的角度彻底理解](http://blog.csdn.net/guolin_blog/article/details/9991569)
  * Github知识:
    * stormzhang的开源书籍:[从 0 开始学习 GitHub 系列-CSDN下载 ](http://download.csdn.net/download/simplebam/9745564)
      ,你也可以关注公众号 stormzhang ，id：googdev，聊天页面回复"github"关键
      字，即可获取，完全免费,但我本人感觉他公众号完全发鸡汤,没什么卵用,所以自己
      load下来上传到csdn博客
    * [Git教程 - 廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000)
      ,我更愿意推荐他的,通俗易懂,我建议可以配合[Pro Git（中文版）](http://git.oschina.net/progit/)一起看效果更佳
    * [github release 功能的使用及问题解决 - Eggy2015的博客 - CSDN博客](http://blog.csdn.net/Eggy2015/article/details/52138751)


### 项目中用到的框架
* 联网框架:OkHttp
  * [Android -- OkHttp的简单使用和封装 - 阿呆哥哥 - 博客园](https://www.cnblogs.com/wjtaigwh/p/6210534.html)
  * [Android网络编程（六）OkHttp3用法全解析 | 刘望舒的博客](http://liuwangshu.cn/application/network/6-okhttp3.html)
  * [OkHttp使用进阶 译自OkHttp Github官方教程 - GavinCT - 博客园](http://www.cnblogs.com/ct2011/p/3997368.html)
  * [Android okHttp网络请求之Get/Post请求 - 总李写代码 - 博客园](http://www.cnblogs.com/whoislcj/p/5526431.html)
  * 目前市面上流行的Xutils3,OkGo,鸿洋大神封装的OKHttpUtils以及OkHttpFinal,这
    里我主要参考stay4it的文章:[OkHttp, Retrofit, Volley应该选择哪一个？](https://www.jianshu.com/p/77d418e7b5d6)
  * 关于OkHttp3无法再通过OkHttpClient.cancel(tag)形式来取消请求,我身边挺多小
    伙伴纷纷还是使用OkHttp2.x问题,我个人认为技术始终需要更新,并非因为一个简单的
    理由就让你停滞,在这里我参考了以下的文章进行OkHttp封装取消:
    * [关于取消OkHttp请求的问题 - 简书](https://www.jianshu.com/p/b74466039b84)
    * 上面这篇文章评论这句话说的特别有道理:其实cancel网络请求的时候，如果还未和
      服务器建立连接，它会回调到onFailure()方法中，但是还有一种情况就是它会在
      onResponse的时候刚好cancel网络请求，那么它会在onResponse()方法中抛出
      java.net.SocketException: Socket closed
* Retrofit
  * [你真的会用Retrofit2吗?Retrofit2完全教程 - 简书](https://www.jianshu.com/p/308f3c54abdd)
* 联网框架:android-async-http
  * [Android-async-http 的用法 - 张兮兮 - 博客园 ](https://www.cnblogs.com/my334420/p/6979641.html)
* 安卓工具类
  * 这里使用吴小龙同学封装的工具类框架:[WuXiaolong/AndroidUtils](https://github.com/WuXiaolong/AndroidUtils)
  * 其他优秀的AndroidUtil:[Blankj/AndroidUtil](https://github.com/Blankj/AndroidUtilCode)
* ButterKnife
  * [[Android开发] ButterKnife8.5.1 使用方法教程总结 - CSDN博客](http://blog.csdn.net/niubitianping/article/details/54893571)
* RxJava
  * 目前最好的RxJava文章,没有之一:[给初学者的RxJava2.0教程(一) - 简书 ](https://www.jianshu.com/p/464fa025229e)
     以及对应的项目教程源码:[ssseasonnn/RxJava2Demo](https://github.com/ssseasonnn/RxJava2Demo)
  * 其他RxJava文章推荐:[RxJava2 学习资料推荐](http://mp.weixin.qq.com/s/UAEgdC2EtqSpEqvog0aoZQ)
  * [RxJava常见的使用场景总结 - 简书 ](https://www.jianshu.com/p/6917510b0e4c)
