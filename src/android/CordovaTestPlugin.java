package com.rdmr.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class CordovaTestPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {
        if ("crash".equals(action)) {
            cordova.getThreadPool().execute(() -> {
                throw new RuntimeException("This is a test crash from CordovaTestPlugin");
            });
        }

        return false;
    }
}
