package ru.formatq.gwtapp.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.widget.core.client.button.TextButton;

/**
 * TODO Написать описание класса
 *
 * @author aivanov
 * @since 03.08.2014
 */
public class GwtAppMvp implements EntryPoint {
    public void onModuleLoad() {
        RootPanel.get().add(new TextButton("ttt2"));
    }
}
