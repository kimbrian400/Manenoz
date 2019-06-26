package com.kimbrian.manenoz.startup;

import android.app.Application;

import com.kimbrian.manenoz.cache.ImagePipelineConfigFactory;
import com.facebook.drawee.backends.pipeline.Fresco;

public class FrescoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this, ImagePipelineConfigFactory.getImagePipelineConfig(this));
    }

}
