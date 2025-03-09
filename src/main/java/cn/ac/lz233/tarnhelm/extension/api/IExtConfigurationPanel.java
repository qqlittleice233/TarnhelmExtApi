package cn.ac.lz233.tarnhelm.extension.api;

import android.content.Context;
import android.view.View;

public interface IExtConfigurationPanel {

    /**
     * This method should build the configuration panel of the extension by returning a view which may contains widgets that are wrapped in a Layout.
     *
     */
    View onRequestConfigurationPanel(Context context, ExtSharedPreferences sharedPreferences);

}
