package com.test.mvprxjavaretrofit02.model;

import java.util.List;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"a3b5a4e1d776342ad8c36218c3b63ce4","title":"终于知道了，2元人民币，为什么见不到了？","date":"2017-10-09 09:54","category":"头条","author_name":"老鬼说收藏","url":"http://mini.eastday.com/mobile/171009095406653.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009_066053a9a86fb40d4bb266e4c98c426a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009_f7e6bac5f3e0f45b0804136aa3532b25_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171009/20171009_703645228715a10870d164f7c6c03705_mwpm_03200403.jpg"},{"uniquekey":"62ea68bdcc064a955528cfe0a855fdb7","title":"伊拉克摄影师用镜头记录军队暴行 获战地记者奖","date":"2017-10-09 10:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009103054969.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009103054_b2ff67fb73918619050bd2b2c1687da8_1_mwpm_03200403.jpg"},{"uniquekey":"1fa2a05331592fe4d95d7b827f899ac5","title":"陈法春任天津外国语大学校长","date":"2017-10-09 10:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009100112857.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009100112_4098ee21b3751710d7857367a636c9c4_1_mwpm_03200403.jpg"},{"uniquekey":"e96f0d01aaa2701f204d9d7f47614070","title":"华侨大学领导班子调整 徐西鹏任校长","date":"2017-10-09 10:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009100112764.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009100112_379833f2004a0830b234a2e67a569f31_1_mwpm_03200403.jpg"},{"uniquekey":"101725442946d8dae43918604dd4f242","title":"七旬卖菜老太菜叶甩城管一脸 城管:以前老人很配合","date":"2017-10-09 09:45","category":"头条","author_name":"法制晚报","url":"http://mini.eastday.com/mobile/171009094509198.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009094509_ebe02cbbabf5d178c82b2e375d0865db_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171009/20171009094509_ebe02cbbabf5d178c82b2e375d0865db_1_mwpm_03200403.jpg"},{"uniquekey":"d3603205695837ed51a03d17b2594022","title":"长江防总：三峡水库近日将出现三万立方米每秒量级的洪水过程","date":"2017-10-09 09:32","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/171009093257433.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009093257_5d450e279db6df9ec885e46ddd7cdd38_1_mwpm_03200403.jpg"},{"uniquekey":"0fcf1db816cad43206ce94ea05e04c7d","title":"世界轮椅小姐大赛在波兰举行 白俄学生摘得桂冠","date":"2017-10-09 09:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009092919252.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009092919_7f704591a2314a4eee0dc949d8e6e497_1_mwpm_03200403.jpg"},{"uniquekey":"b6902d9771ef72d9d7d6849208a7a38d","title":"山西打出大气治污组合拳：PM2.5不降反升将问责市委书记","date":"2017-10-09 09:21","category":"头条","author_name":"\u201c山西晚报\u201d微信公众号","url":"http://mini.eastday.com/mobile/171009092115403.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_2_mwpm_03200403.jpg"},{"uniquekey":"6afbc777cff890ca5ad4fd872644d82e","title":"贵州省正厅级干部曾健严重违纪被双开 ","date":"2017-10-09 09:17","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009091717782.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009091717_2d5a5fb0de4961a2b26aa70abb0fd7c1_1_mwpm_03200403.jpg"},{"uniquekey":"5a056c4cd4683966e3fb6949a2472c7f","title":"歼15电磁弹射器首飞之后又研新设备：首艘国产航母无法享用","date":"2017-10-09 09:15","category":"头条","author_name":"科技扒一扒","url":"http://mini.eastday.com/mobile/171009091553970.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009_e931312f9d69a07e2748ef2183f0e363_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009_dd3702a165aeff6b4b59f82214a0c184_cover_mwpm_03200403.jpg"},{"uniquekey":"a5fef5c67b9d2834cc88c7da34ee1457","title":"日本一小型机起飞时发生侧翻 4人受伤","date":"2017-10-09 09:09","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009090900878.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009090900_89603e7e7c20c5b712c9aaeb7d42f700_1_mwpm_03200403.jpg"},{"uniquekey":"bfae338a9fee07f137681af38a9d8903","title":"美国新一代隐形战略轰炸机, 号称世界第一俄罗斯也比不上","date":"2017-10-09 09:07","category":"头条","author_name":"扒姐观察室","url":"http://mini.eastday.com/mobile/171009090742314.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009_d2388056c7e6374219393637d8a63797_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009_8b0c1999da8d8bbfd89a3340413acd7d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171009/20171009_97351c4de202d3f931e32dc67ed875ab_cover_mwpm_03200403.jpg"},{"uniquekey":"de09d65a40f97df141c9d4b40552bff3","title":"土逮捕美领馆雇员风波升级：美停办非移民签证，土对等报复","date":"2017-10-09 08:58","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/171009085851015.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171009/20171009085851_54f30e83c5ef78b6e23ba0f8dde97a6a_1_mwpm_03200403.jpg"},{"uniquekey":"c6bb737a7c269fc2e3b5eeeaede82224","title":"有缘无分？当恋人不如做朋友的12星座配对！","date":"2017-10-09 08:46","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171009084637923.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171009/20171009084637_7a477c853e90852bcab74b4617f660fa_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171009/20171009084637_7a477c853e90852bcab74b4617f660fa_2_mwpm_03200403.jpg"},{"uniquekey":"980e6652415b0e401a3e6c24142b55e1","title":"郎朗亮相卡内基音乐厅开季音乐会 众人捧场","date":"2017-10-09 08:43","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/171009084356305.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_cefbf1568976f772af079533549f8572_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_e1bf2fd4856afde9f1664547d4684c9d_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_2444b4307542cccd635b61c28967bb60_4_mwpm_03200403.jpg"},{"uniquekey":"b53090f50ff25e71da983ddc152c944d","title":"解锁特战队员的体能密码","date":"2017-10-09 08:41","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/171009084135894.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171009/20171009084135_3578bad29e4bcb10da8a7651c03bd93b_1_mwpm_03200403.jpg"},{"uniquekey":"47e4e1df8fdb740c5a45c4a811c2a9d4","title":"强冷空气来袭！北方开启\u201c速冻\u201d模式","date":"2017-10-09 08:39","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/171009083957367.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009083957_622a8a13882079a8d3e7683cf81f7ff2_1_mwpm_03200403.jpg"},{"uniquekey":"8db4a2c03ae579884dc16d628005e18b","title":"美国前总统肯尼迪私人物品被拍卖 泳裤以1800美元拍出","date":"2017-10-09 08:38","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009083815636.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009083815_34083698fe7f7ed07ede5f3160c9ac82_1_mwpm_03200403.jpg"},{"uniquekey":"372209349e606280d282a8311e09478c","title":"上半年的旗舰手机都降价了，唯独这款不锈钢边框手机售价依然坚挺","date":"2017-10-09 08:37","category":"头条","author_name":"维哥自媒体","url":"http://mini.eastday.com/mobile/171009083754395.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_3_mwpm_03200403.jpg"},{"uniquekey":"e1ab457bec4ae72360cd59c0c33d4e20","title":"增肌减脂多做些睡前瑜伽拉伸，健身效率会提升很多！","date":"2017-10-09 08:25","category":"头条","author_name":"整体健身","url":"http://mini.eastday.com/mobile/171009082551155.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_5_mwpm_03200403.jpg"},{"uniquekey":"9dc783a362d7d9a178a5672b0f72f373","title":"赵老实：就想问一句，这万恶的格子间到底是谁发明的","date":"2017-10-09 08:21","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/171009082129724.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"09727a656a5a6216c885ed5c50a7a7eb","title":"女子打工回家敲门没人开, 打开门见到丈夫的动作让她彻底崩溃","date":"2017-10-09 08:20","category":"头条","author_name":"奇人囧事","url":"http://mini.eastday.com/mobile/171009082020801.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009_e8443c1fe0e358bafe5f2c10900ed566_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009_5e592f776a80056b068b1d9fd65664f9_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009_65afe2542af5a434c69b33690ec9ef57_cover_mwpm_03200403.jpg"},{"uniquekey":"cf1b8e8aea9175de84136a40227c8c24","title":"画风满满！普京生日，贝卢斯科尼送印有两人的被罩","date":"2017-10-09 08:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009081753278.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009081753_4f9b7927fc6b6b8b5f9898f6f8440bb8_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009081753_4f9b7927fc6b6b8b5f9898f6f8440bb8_1_mwpm_03200403.jpg"},{"uniquekey":"4365a39c0cfb855e0cfec0c9c50f30ab","title":"中国战略无人机现身西藏？被指性能与全球鹰相似","date":"2017-10-09 08:17","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/171009081751590.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009081751_ada0eb52e7c322e3f6dbe7936ebf2b41_1_mwpm_03200403.jpg"},{"uniquekey":"6d28426115c71257cf0ff54ed0b18142","title":"超长假期之后的数据说明了什么？","date":"2017-10-09 08:16","category":"头条","author_name":"百度百家","url":"http://mini.eastday.com/mobile/171009081641220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_3_mwpm_03200403.jpg"},{"uniquekey":"5cdd2e506de3eec3b36603b4a8b69159","title":"商场男子衣服被扒光，跪地求饶无果，究竟怎么了？","date":"2017-10-09 08:15","category":"头条","author_name":"老罗说","url":"http://mini.eastday.com/mobile/171009081514787.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009_631313b2f544d3282e90fcb5120696cb_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171009/20171009_d3eb2c56941bc8d4ca020edb8a370e47_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171009/20171009_a23f2955cc88a25ef2b508be88e3f412_cover_mwpm_03200403.jpg"},{"uniquekey":"729396f6261586d17733871d7554c270","title":"古巴纪念格瓦拉逝世50年 总统出席仪式","date":"2017-10-09 08:07","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/171009080735396.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_4_mwpm_03200403.jpg"},{"uniquekey":"ab6c97f06507c2f036d91f9645255960","title":"没伤\u201c敌人\u201d一兵一卒竟获胜，原来都靠它！","date":"2017-10-09 08:00","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/171009080048738.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171009/20171009080048_74618df97a1a5ed32ea60fe009b0dad9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171009/20171009080048_74618df97a1a5ed32ea60fe009b0dad9_1_mwpm_03200403.jpg"},{"uniquekey":"c9d75bef1a77bd3e824019aab3d52a49","title":"全面从严治党是完成历史使命的根本保证","date":"2017-10-09 08:00","category":"头条","author_name":"北京日报","url":"http://mini.eastday.com/mobile/171009080012149.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009080012_fe7dec8357d016481c33b7b73802a2c9_1_mwpm_03200403.jpg"},{"uniquekey":"0e8b24286aa2750f1d0f5a9a6d203aca","title":"人类是被关押在地球的流放者? 人类真正的起源有可能不是地球!","date":"2017-10-09 07:58","category":"头条","author_name":"科学探索发现","url":"http://mini.eastday.com/mobile/171009075857919.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009_fa2ff010335d0a0f48827b116104f60e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009_04e2b5e63ce8d1e99ee0c4fb4b3d16e3_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009_2107fae70ee5c2b8483e5b4b7d065c91_cover_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"a3b5a4e1d776342ad8c36218c3b63ce4","title":"终于知道了，2元人民币，为什么见不到了？","date":"2017-10-09 09:54","category":"头条","author_name":"老鬼说收藏","url":"http://mini.eastday.com/mobile/171009095406653.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009_066053a9a86fb40d4bb266e4c98c426a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009_f7e6bac5f3e0f45b0804136aa3532b25_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171009/20171009_703645228715a10870d164f7c6c03705_mwpm_03200403.jpg"},{"uniquekey":"62ea68bdcc064a955528cfe0a855fdb7","title":"伊拉克摄影师用镜头记录军队暴行 获战地记者奖","date":"2017-10-09 10:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009103054969.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009103054_b2ff67fb73918619050bd2b2c1687da8_1_mwpm_03200403.jpg"},{"uniquekey":"1fa2a05331592fe4d95d7b827f899ac5","title":"陈法春任天津外国语大学校长","date":"2017-10-09 10:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009100112857.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009100112_4098ee21b3751710d7857367a636c9c4_1_mwpm_03200403.jpg"},{"uniquekey":"e96f0d01aaa2701f204d9d7f47614070","title":"华侨大学领导班子调整 徐西鹏任校长","date":"2017-10-09 10:01","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009100112764.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009100112_379833f2004a0830b234a2e67a569f31_1_mwpm_03200403.jpg"},{"uniquekey":"101725442946d8dae43918604dd4f242","title":"七旬卖菜老太菜叶甩城管一脸 城管:以前老人很配合","date":"2017-10-09 09:45","category":"头条","author_name":"法制晚报","url":"http://mini.eastday.com/mobile/171009094509198.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009094509_ebe02cbbabf5d178c82b2e375d0865db_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171009/20171009094509_ebe02cbbabf5d178c82b2e375d0865db_1_mwpm_03200403.jpg"},{"uniquekey":"d3603205695837ed51a03d17b2594022","title":"长江防总：三峡水库近日将出现三万立方米每秒量级的洪水过程","date":"2017-10-09 09:32","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/171009093257433.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009093257_5d450e279db6df9ec885e46ddd7cdd38_1_mwpm_03200403.jpg"},{"uniquekey":"0fcf1db816cad43206ce94ea05e04c7d","title":"世界轮椅小姐大赛在波兰举行 白俄学生摘得桂冠","date":"2017-10-09 09:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009092919252.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009092919_7f704591a2314a4eee0dc949d8e6e497_1_mwpm_03200403.jpg"},{"uniquekey":"b6902d9771ef72d9d7d6849208a7a38d","title":"山西打出大气治污组合拳：PM2.5不降反升将问责市委书记","date":"2017-10-09 09:21","category":"头条","author_name":"\u201c山西晚报\u201d微信公众号","url":"http://mini.eastday.com/mobile/171009092115403.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009092115_2945adc4e114f55d8f5f30619c812ebe_2_mwpm_03200403.jpg"},{"uniquekey":"6afbc777cff890ca5ad4fd872644d82e","title":"贵州省正厅级干部曾健严重违纪被双开 ","date":"2017-10-09 09:17","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171009091717782.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009091717_2d5a5fb0de4961a2b26aa70abb0fd7c1_1_mwpm_03200403.jpg"},{"uniquekey":"5a056c4cd4683966e3fb6949a2472c7f","title":"歼15电磁弹射器首飞之后又研新设备：首艘国产航母无法享用","date":"2017-10-09 09:15","category":"头条","author_name":"科技扒一扒","url":"http://mini.eastday.com/mobile/171009091553970.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009_e931312f9d69a07e2748ef2183f0e363_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009_dd3702a165aeff6b4b59f82214a0c184_cover_mwpm_03200403.jpg"},{"uniquekey":"a5fef5c67b9d2834cc88c7da34ee1457","title":"日本一小型机起飞时发生侧翻 4人受伤","date":"2017-10-09 09:09","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009090900878.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009090900_89603e7e7c20c5b712c9aaeb7d42f700_1_mwpm_03200403.jpg"},{"uniquekey":"bfae338a9fee07f137681af38a9d8903","title":"美国新一代隐形战略轰炸机, 号称世界第一俄罗斯也比不上","date":"2017-10-09 09:07","category":"头条","author_name":"扒姐观察室","url":"http://mini.eastday.com/mobile/171009090742314.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009_d2388056c7e6374219393637d8a63797_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009_8b0c1999da8d8bbfd89a3340413acd7d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171009/20171009_97351c4de202d3f931e32dc67ed875ab_cover_mwpm_03200403.jpg"},{"uniquekey":"de09d65a40f97df141c9d4b40552bff3","title":"土逮捕美领馆雇员风波升级：美停办非移民签证，土对等报复","date":"2017-10-09 08:58","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/171009085851015.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171009/20171009085851_54f30e83c5ef78b6e23ba0f8dde97a6a_1_mwpm_03200403.jpg"},{"uniquekey":"c6bb737a7c269fc2e3b5eeeaede82224","title":"有缘无分？当恋人不如做朋友的12星座配对！","date":"2017-10-09 08:46","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171009084637923.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171009/20171009084637_7a477c853e90852bcab74b4617f660fa_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171009/20171009084637_7a477c853e90852bcab74b4617f660fa_2_mwpm_03200403.jpg"},{"uniquekey":"980e6652415b0e401a3e6c24142b55e1","title":"郎朗亮相卡内基音乐厅开季音乐会 众人捧场","date":"2017-10-09 08:43","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/171009084356305.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_cefbf1568976f772af079533549f8572_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_e1bf2fd4856afde9f1664547d4684c9d_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009084356_2444b4307542cccd635b61c28967bb60_4_mwpm_03200403.jpg"},{"uniquekey":"b53090f50ff25e71da983ddc152c944d","title":"解锁特战队员的体能密码","date":"2017-10-09 08:41","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/171009084135894.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171009/20171009084135_3578bad29e4bcb10da8a7651c03bd93b_1_mwpm_03200403.jpg"},{"uniquekey":"47e4e1df8fdb740c5a45c4a811c2a9d4","title":"强冷空气来袭！北方开启\u201c速冻\u201d模式","date":"2017-10-09 08:39","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/171009083957367.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009083957_622a8a13882079a8d3e7683cf81f7ff2_1_mwpm_03200403.jpg"},{"uniquekey":"8db4a2c03ae579884dc16d628005e18b","title":"美国前总统肯尼迪私人物品被拍卖 泳裤以1800美元拍出","date":"2017-10-09 08:38","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009083815636.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009083815_34083698fe7f7ed07ede5f3160c9ac82_1_mwpm_03200403.jpg"},{"uniquekey":"372209349e606280d282a8311e09478c","title":"上半年的旗舰手机都降价了，唯独这款不锈钢边框手机售价依然坚挺","date":"2017-10-09 08:37","category":"头条","author_name":"维哥自媒体","url":"http://mini.eastday.com/mobile/171009083754395.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171009/20171009083754_9fc1d3194ae550abfe78fd9e1b8773ba_3_mwpm_03200403.jpg"},{"uniquekey":"e1ab457bec4ae72360cd59c0c33d4e20","title":"增肌减脂多做些睡前瑜伽拉伸，健身效率会提升很多！","date":"2017-10-09 08:25","category":"头条","author_name":"整体健身","url":"http://mini.eastday.com/mobile/171009082551155.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009082551_31cd3c9686d790f88e6756e6049c36bd_5_mwpm_03200403.jpg"},{"uniquekey":"9dc783a362d7d9a178a5672b0f72f373","title":"赵老实：就想问一句，这万恶的格子间到底是谁发明的","date":"2017-10-09 08:21","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/171009082129724.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171009/20171009082129_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"09727a656a5a6216c885ed5c50a7a7eb","title":"女子打工回家敲门没人开, 打开门见到丈夫的动作让她彻底崩溃","date":"2017-10-09 08:20","category":"头条","author_name":"奇人囧事","url":"http://mini.eastday.com/mobile/171009082020801.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009_e8443c1fe0e358bafe5f2c10900ed566_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009_5e592f776a80056b068b1d9fd65664f9_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009_65afe2542af5a434c69b33690ec9ef57_cover_mwpm_03200403.jpg"},{"uniquekey":"cf1b8e8aea9175de84136a40227c8c24","title":"画风满满！普京生日，贝卢斯科尼送印有两人的被罩","date":"2017-10-09 08:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171009081753278.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171009/20171009081753_4f9b7927fc6b6b8b5f9898f6f8440bb8_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171009/20171009081753_4f9b7927fc6b6b8b5f9898f6f8440bb8_1_mwpm_03200403.jpg"},{"uniquekey":"4365a39c0cfb855e0cfec0c9c50f30ab","title":"中国战略无人机现身西藏？被指性能与全球鹰相似","date":"2017-10-09 08:17","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/171009081751590.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171009/20171009081751_ada0eb52e7c322e3f6dbe7936ebf2b41_1_mwpm_03200403.jpg"},{"uniquekey":"6d28426115c71257cf0ff54ed0b18142","title":"超长假期之后的数据说明了什么？","date":"2017-10-09 08:16","category":"头条","author_name":"百度百家","url":"http://mini.eastday.com/mobile/171009081641220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171009/20171009081641_5c24b06ac1ba3d1bba1ebc250cd25808_3_mwpm_03200403.jpg"},{"uniquekey":"5cdd2e506de3eec3b36603b4a8b69159","title":"商场男子衣服被扒光，跪地求饶无果，究竟怎么了？","date":"2017-10-09 08:15","category":"头条","author_name":"老罗说","url":"http://mini.eastday.com/mobile/171009081514787.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009_631313b2f544d3282e90fcb5120696cb_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171009/20171009_d3eb2c56941bc8d4ca020edb8a370e47_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171009/20171009_a23f2955cc88a25ef2b508be88e3f412_cover_mwpm_03200403.jpg"},{"uniquekey":"729396f6261586d17733871d7554c270","title":"古巴纪念格瓦拉逝世50年 总统出席仪式","date":"2017-10-09 08:07","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/171009080735396.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171009/20171009080735_a36a7bbf7e4e9bc2394e87c50b515963_4_mwpm_03200403.jpg"},{"uniquekey":"ab6c97f06507c2f036d91f9645255960","title":"没伤\u201c敌人\u201d一兵一卒竟获胜，原来都靠它！","date":"2017-10-09 08:00","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/171009080048738.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171009/20171009080048_74618df97a1a5ed32ea60fe009b0dad9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171009/20171009080048_74618df97a1a5ed32ea60fe009b0dad9_1_mwpm_03200403.jpg"},{"uniquekey":"c9d75bef1a77bd3e824019aab3d52a49","title":"全面从严治党是完成历史使命的根本保证","date":"2017-10-09 08:00","category":"头条","author_name":"北京日报","url":"http://mini.eastday.com/mobile/171009080012149.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171009/20171009080012_fe7dec8357d016481c33b7b73802a2c9_1_mwpm_03200403.jpg"},{"uniquekey":"0e8b24286aa2750f1d0f5a9a6d203aca","title":"人类是被关押在地球的流放者? 人类真正的起源有可能不是地球!","date":"2017-10-09 07:58","category":"头条","author_name":"科学探索发现","url":"http://mini.eastday.com/mobile/171009075857919.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171009/20171009_fa2ff010335d0a0f48827b116104f60e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171009/20171009_04e2b5e63ce8d1e99ee0c4fb4b3d16e3_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171009/20171009_2107fae70ee5c2b8483e5b4b7d065c91_cover_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : a3b5a4e1d776342ad8c36218c3b63ce4
             * title : 终于知道了，2元人民币，为什么见不到了？
             * date : 2017-10-09 09:54
             * category : 头条
             * author_name : 老鬼说收藏
             * url : http://mini.eastday.com/mobile/171009095406653.html
             * thumbnail_pic_s : http://09.imgmini.eastday.com/mobile/20171009/20171009_066053a9a86fb40d4bb266e4c98c426a_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://09.imgmini.eastday.com/mobile/20171009/20171009_f7e6bac5f3e0f45b0804136aa3532b25_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://09.imgmini.eastday.com/mobile/20171009/20171009_703645228715a10870d164f7c6c03705_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
