package com.jph.scaleview;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * 支持设置宽高比例的ImageView
 * Created by jph on 2019-09-04.
 */
public class ScaleImageView extends AppCompatImageView implements ScaleViewProxy.IScaleView {

    private ScaleViewProxy scaleViewProxy;

    public ScaleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        scaleViewProxy = new ScaleViewProxy(this);
        scaleViewProxy.init(context, attrs);
    }

    public ScaleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        scaleViewProxy = new ScaleViewProxy(this);
        scaleViewProxy.init(context, attrs);
    }

    public ScaleImageView(Context context) {
        super(context);
        scaleViewProxy = new ScaleViewProxy(this);
        scaleViewProxy.init(context, null);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        ScaleViewProxy.MeasureSize measureSize = scaleViewProxy.measureSize(widthMeasureSpec,
                heightMeasureSpec);

        setMeasuredDimension(measureSize.getWidth(), measureSize.getHeight());
    }

    @Override
    public int getModelBy() {
        return scaleViewProxy.getModelBy();
    }

    @Override
    public void setModelBy(int modelBy) {
        scaleViewProxy.setModelBy(modelBy);
    }

    @Override
    public float getMultiple() {
        return scaleViewProxy.getMultiple();
    }

    @Override
    public void setMultiple(float multiple) {
        scaleViewProxy.setMultiple(multiple);
    }
}

