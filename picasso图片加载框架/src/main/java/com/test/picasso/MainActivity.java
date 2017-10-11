package com.test.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);

        //Picasso基本使用
        //这个方法是获取图片加载的位置,内存,本地(磁盘),网络?
        //设置为true在左上角会有一个颜色的三角,绿色内存,蓝色本地磁盘,红色网络
//        Picasso.with(this).setIndicatorsEnabled(true);
        //开启Log打印,可以获取图片加载的线程,和图片加载的位置,内存,本地(磁盘),网络?
        Picasso.with(this).setLoggingEnabled(true);
        Picasso.with(this)
                .load("http://f.hiphotos.baidu.com/baike/pic/item/cb8065380cd79123f2935ccea5345982b2b7801d.jpg")
                .placeholder(R.mipmap.ic_launcher_round)//显示正在加载的图片
                .error(R.mipmap.ic_launcher)//加载错入图片
                .resize(500, 500)//重新设置尺寸,只有比布局尺寸大的时候才会生效
                .centerInside()//居中裁剪的同时,还能把图片完全显示
//                .centerCrop()//居中裁剪,加载图片可能会不全
//                .rotate(80)//使图片旋转,但不是选中动画,把位置旋转了
//                .noFade()//取消图片加载的渐入效果
//                .fit()//自动裁剪图片.会把图片裁剪的很小,不建议使用
                //静止缓存到内存中,一般使用在图片比较大,耗费内存的时候使用
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
//                .networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.NO_STORE)//静止磁盘缓存
//                .networkPolicy(NetworkPolicy.OFFLINE)//强制从磁盘中获取缓存,不论磁盘是否有缓存
//                .transform(new CropCircleTransformation())//加载圆形图片
//                .transform(new RoundedCornersTransformation(30,5))//圆角图片,第二个参数是margin距离
//                .transform(new SwirlFilterTransformation(this))//图片从中间开始出现旋涡
                //设置模糊图片,第二个参数可加,可不加,设置的是模糊的程度
//                .transform(new BlurTransformation(this, 10))
                .into(img);
    }
}
