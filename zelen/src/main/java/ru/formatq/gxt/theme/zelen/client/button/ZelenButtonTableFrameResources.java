/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.button;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.button.ButtonTableFrameResources;
import com.sencha.gxt.theme.base.client.frame.TableFrame.TableFrameStyle;

public interface ZelenButtonTableFrameResources extends ButtonTableFrameResources {

    @Source({"com/sencha/gxt/theme/base/client/frame/TableFrame.css", "com/sencha/gxt/theme/base/client/button/ButtonTableFrame.css", "ButtonTableFrame.css"})
    @Override
    TableFrameStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource background();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource backgroundOverBorder();

    @Override
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource backgroundPressedBorder();

    @Override
    ImageResource topLeftBorder();

    @Override
    ImageResource topLeftOverBorder();

    @Override
    ImageResource topLeftPressedBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource topBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource topOverBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource topPressedBorder();

    @Override
    ImageResource topRightBorder();

    @Override
    ImageResource topRightOverBorder();

    @Override
    ImageResource topRightPressedBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource leftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource leftOverBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource leftPressedBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource rightBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource rightOverBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource rightPressedBorder();

    @Override
    ImageResource bottomLeftBorder();

    @Override
    ImageResource bottomLeftOverBorder();

    @Override
    ImageResource bottomLeftPressedBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource bottomBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource bottomOverBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource bottomPressedBorder();

    @Override
    ImageResource bottomRightBorder();

    @Override
    ImageResource bottomRightOverBorder();

    @Override
    ImageResource bottomRightPressedBorder();

}

