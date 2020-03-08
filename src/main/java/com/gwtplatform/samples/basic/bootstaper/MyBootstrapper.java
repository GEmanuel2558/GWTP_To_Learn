package com.gwtplatform.samples.basic.bootstaper;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class MyBootstrapper implements Bootstrapper {

    private final PlaceManager placeManager;

    @Inject
    public MyBootstrapper(
            PlaceManager placeManager) {
        this.placeManager = placeManager;
    }

    @Override
    public void onBootstrap() {
        placeManager.revealCurrentPlace();
    }
}
