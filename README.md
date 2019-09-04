# 设置宽高比的View


支持设置宽高比例来控制View尺寸（暂时支持了ImageView，其他View需要仿照`ScaleImage`使用`ScaleProxy`类手动实现）

####  使用方式：
`modelby`设置以`width`or`height`为基准，`multiple`设置比例倍数

xml中直接设置：


```xml
    <com.jph.scaleview.ScaleImageView
        android:layout_width="100dp"
        android:layout_height="wrap_content"
        android:background="@color/colorAccent"
        app:modelby="by_width"
        app:multiple="1"
        />

    <com.jph.scaleview.ScaleImageView
        android:layout_width="wrap_content"
        android:layout_height="100dp"
        android:layout_marginTop="12dp"
        android:background="@android:color/black"
        app:modelby="by_height"
        app:multiple="1.5"
        />
```

代码中设置：
```java
        ScaleImageView img = findViewById(R.id.main_img_3);
        img.setModelBy(ScaleViewProxy.BY_WIDTH);
        img.setMultiple(0.5f);
```
