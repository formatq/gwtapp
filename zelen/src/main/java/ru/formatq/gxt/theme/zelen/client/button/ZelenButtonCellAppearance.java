/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.button;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.google.gwt.safecss.shared.SafeStyles;
import com.google.gwt.safecss.shared.SafeStylesBuilder;
import com.google.gwt.safecss.shared.SafeStylesUtils;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.sencha.gxt.cell.core.client.ButtonCell;
import com.sencha.gxt.cell.core.client.ButtonCell.ButtonCellAppearance;
import com.sencha.gxt.cell.core.client.ButtonCell.ButtonScale;
import com.sencha.gxt.cell.core.client.ButtonCell.IconAlign;
import com.sencha.gxt.cell.core.client.SplitButtonCell;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.core.client.resources.CommonStyles;
import com.sencha.gxt.core.client.resources.StyleInjectorHelper;
import com.sencha.gxt.core.client.util.TextMetrics;
import com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance;
import com.sencha.gxt.theme.base.client.button.ButtonTableFrameResources;
import com.sencha.gxt.theme.base.client.frame.Frame;
import com.sencha.gxt.theme.base.client.frame.TableFrame;

/**
 * Default implementation of the <code>ButtonCellAppearance</code>.
 * 
 * <p />
 * Note: The Blue and Gray buttons.
 * 
 * @param <C> the button data type
 */
public class ZelenButtonCellAppearance<C> implements ButtonCellAppearance<C> {

  public interface ZelenButtonCellResources extends ButtonCellDefaultAppearance.ButtonCellResources {

    @Source({"com/sencha/gxt/theme/base/client/button/ButtonCell.css", "ZelenButtonCell.css"})
    @Override
    ZelenButtonCellStyle style();
  }

  public interface ZelenButtonCellStyle extends ButtonCellDefaultAppearance.ButtonCellStyle {

    String arrow();

    String arrowBottom();

    String button();

    String hasWidth();

    String iconBottom();

    String iconLeft();

    String iconRight();

    String iconTop();

    String iconWrap();

    String large();

    String mainTable();

    String medium();

    String noIcon();

    String over();

    String small();

    String split();

    String splitBottom();

    String text();

  }

  public interface ButtonCellTemplates extends XTemplates {

    @XTemplate("<td valign=middle class=\"{iconWrapClass}\">{imageHtml}</td>")
    SafeHtml icon(String iconWrapClass, SafeHtml imageHtml);

    @XTemplate("<td valign=middle class=\"{iconWrapClass}\">{imageHtml}</td>")
    SafeHtml iconWithStyles(String iconWrapClass, SafeStyles imageStyles, SafeHtml imageHtml);

    @XTemplate("<div class=\"{cls}\" style=\"{styles}\">")
    SafeHtml outer(String cls, SafeStyles styles);

    @XTemplate("<td valign=middle style=\"{textStyles}\"><div class=\"{textClass}\" >{text}</div></td>")
    SafeHtml textWithStyles(String textClass, SafeStyles textStyles, SafeHtml text);

  }

  protected final Frame frame;
  protected final ZelenButtonCellResources resources;
  protected final ZelenButtonCellStyle style;
  protected final ButtonCellTemplates templates;

  private int heightOffset;

  /**
   * Creates a button cell base appearance.
   */
  public ZelenButtonCellAppearance() {
    this(GWT.<ZelenButtonCellResources> create(ZelenButtonCellResources.class));
  }

  /**
   * Creates a button cell base appearance using the specified resources and templates.
   * 
   * @param resources the button cell resources
   */
  public ZelenButtonCellAppearance(ZelenButtonCellResources resources) {
    this(resources, GWT.<ButtonCellTemplates> create(ButtonCellTemplates.class), new TableFrame(
        GWT.<ButtonTableFrameResources> create(ZelenButtonTableFrameResources.class)));
  }

  /**
   * Creates a button cell base appearance using the specified resources and templates.
   * 
   * @param resources the button cell resources
   * @param templates the templates
   * @param frame the frame
   */
  public ZelenButtonCellAppearance(ZelenButtonCellResources resources, ButtonCellTemplates templates, Frame frame) {
    this.resources = resources;
    this.templates = templates;
    this.frame = frame;

    this.style = resources.style();

    StyleInjectorHelper.ensureInjected(this.style, true);

    heightOffset = frame.getFrameSize(null).getHeight();
  }

  @Override
  public XElement getButtonElement(XElement parent) {
    return parent.selectNode("table");
  }

  @Override
  public XElement getFocusElement(XElement parent) {
    return parent.getFirstChildElement().getFirstChildElement().cast();
  }

  @Override
  public void onFocus(XElement parent, boolean focused) {
    frame.onFocus(parent, focused);
  }

  @Override
  public void onOver(XElement parent, boolean over) {
    frame.onOver(parent, over);
    parent.setClassName(style.over(), over);
  }

  @Override
  public void onPress(XElement parent, boolean pressed) {
    frame.onPress(parent, pressed);
  }

  @Override
  public void onToggle(XElement parent, boolean pressed) {
    // we pass child of parent so toggle state is not lost when real press state
    // is modified
    frame.onPress(parent.getFirstChildElement().<XElement> cast(), pressed);
  }

  @Override
  public void render(final ButtonCell<C> cell, Context context, C value, SafeHtmlBuilder sb) {
    String constantHtml = cell.getHTML();
    boolean hasConstantHtml = constantHtml != null && constantHtml.length() != 0;
    boolean isBoolean = value != null && value instanceof Boolean;
    // is a boolean always a toggle button?
    String text = hasConstantHtml ? cell.getText() : (value != null && !isBoolean)
        ? SafeHtmlUtils.htmlEscape(value.toString()) : "";

    ImageResource icon = cell.getIcon();
    IconAlign iconAlign = cell.getIconAlign();

    String cls = style.button();
    String arrowCls = "";
    if (cell.getMenu() != null) {

      if (cell instanceof SplitButtonCell) {
        switch (cell.getArrowAlign()) {
          case RIGHT:
            arrowCls = style.split();
            break;
          case BOTTOM:
            arrowCls = style.splitBottom();
            break;
          default:
            // empty
        }

      } else {
        switch (cell.getArrowAlign()) {
          case RIGHT:
            arrowCls = style.arrow();
            break;
          case BOTTOM:
            arrowCls = style.arrowBottom();
            break;
        }
      }

    }

    ButtonScale scale = cell.getScale();

    switch (scale) {
      case SMALL:
        cls += " " + style.small();
        break;
      case MEDIUM:
        cls += " " + style.medium();
        break;
      case LARGE:
        cls += " " + style.large();
        break;
      default:
        // empty
    }

    SafeStylesBuilder stylesBuilder = new SafeStylesBuilder();

    int width = -1;

    if (cell.getWidth() != -1) {
      int w = cell.getWidth();
      if (w < cell.getMinWidth()) {
        w = cell.getMinWidth();
      }
      stylesBuilder.appendTrustedString("width:" + w + "px;");
      cls += " " + style.hasWidth() + " x-has-width";
      width = w;
    } else {

      if (cell.getMinWidth() != -1) {
        TextMetrics.get().bind(style.text());
        int length = TextMetrics.get().getWidth(text);
        length += 6; // frames

        if (icon != null) {
          switch (iconAlign) {
            case LEFT:
            case RIGHT:
              length += icon.getWidth();
              break;
            default:
              // empty
          }
        }

        if (cell.getMinWidth() > length) {
          stylesBuilder.appendTrustedString("width:" + cell.getMinWidth() + "px;");
          cls += " " + style.hasWidth() + " x-has-width";
          width = cell.getMinWidth();
        }
      }
    }

    final int height = cell.getHeight();
    if (height != -1) {
      stylesBuilder.appendTrustedString("height:" + height + "px;");
    }

    if (icon != null) {
      switch (iconAlign) {
        case TOP:
          arrowCls += " " + style.iconTop();
          break;
        case BOTTOM:
          arrowCls += " " + style.iconBottom();
          break;
        case LEFT:
          arrowCls += " " + style.iconLeft();
          break;
        case RIGHT:
          arrowCls += " " + style.iconRight();
          break;
      }

    } else {
      arrowCls += " " + style.noIcon();
    }

    // toggle button
    if (value == Boolean.TRUE) {
      cls += " " + frame.pressedClass();
    }

    sb.append(templates.outer(cls, new SafeStylesBuilder().toSafeStyles()));

    SafeHtmlBuilder inside = new SafeHtmlBuilder();

    String innerWrap = arrowCls;
    if (GXT.isIE6() || GXT.isIE7()) {
      arrowCls += " " + CommonStyles.get().inlineBlock();
    }

    inside.appendHtmlConstant("<div class='" + innerWrap + "'>");
    inside.appendHtmlConstant("<table cellpadding=0 cellspacing=0 class='" + style.mainTable() + "'>");

    boolean hasText = text != null && !text.equals("");

    if (icon != null) {
      switch (iconAlign) {
        case LEFT:
          inside.appendHtmlConstant("<tr>");
          writeIcon(inside, icon, height);
          if (hasText) {
            int w = width - (icon != null ? icon.getWidth() : 0) - 4;
            writeText(inside, text, w, height);
          }
          inside.appendHtmlConstant("</tr>");
          break;
        case RIGHT:
          inside.appendHtmlConstant("<tr>");
          if (hasText) {
            int w = width - (icon != null ? icon.getWidth() : 0) - 4;
            writeText(inside, text, w, height);
          }
          writeIcon(inside, icon, height);
          inside.appendHtmlConstant("</tr>");
          break;
        case TOP:
          inside.appendHtmlConstant("<tr>");
          writeIcon(inside, icon, height);
          inside.appendHtmlConstant("</tr>");
          if (hasText) {
            inside.appendHtmlConstant("<tr>");
            writeText(inside, text, width, height);
            inside.appendHtmlConstant("</tr>");
          }
          break;
        case BOTTOM:
          if (hasText) {
            inside.appendHtmlConstant("<tr>");
            writeText(inside, text, width, height);
            inside.appendHtmlConstant("</tr>");
          }
          inside.appendHtmlConstant("<tr>");
          writeIcon(inside, icon, height);
          inside.appendHtmlConstant("</tr>");
          break;
      }

    } else {
      inside.appendHtmlConstant("<tr>");
      if (text != null) {
        writeText(inside, text, width, height);
      }
      inside.appendHtmlConstant("</tr>");
    }
    inside.appendHtmlConstant("</table>");
    inside.appendHtmlConstant("</div>");

    frame.render(sb, new Frame.FrameOptions(0, CommonStyles.get().noFocusOutline(), stylesBuilder.toSafeStyles()),
        inside.toSafeHtml());

    sb.appendHtmlConstant("</div>");

  }

  protected void writeIcon(SafeHtmlBuilder builder, ImageResource icon, int height) {
    SafeHtml iconHtml = AbstractImagePrototype.create(icon).getSafeHtml();
    if (height == -1) {
      builder.append(templates.icon(style.iconWrap(), iconHtml));
    } else {
      int adjustedHeight = height - heightOffset;
      SafeStyles heightStyle = SafeStylesUtils.fromTrustedString("height:" + adjustedHeight + "px;");
      builder.append(templates.iconWithStyles(style.iconWrap(), heightStyle, iconHtml));
    }
  }

  protected void writeText(SafeHtmlBuilder builder, String text, int width, int height) {
    SafeStylesBuilder sb = new SafeStylesBuilder();
    if (height > 0) {
      int adjustedHeight = height - heightOffset;
      sb.append(SafeStylesUtils.fromTrustedString("height:" + adjustedHeight + "px;"));
    }
    if (width > 0) {
      sb.append(SafeStylesUtils.fromTrustedString("width:" + width + "px;"));
    }
    builder.append(templates.textWithStyles(style.text(), sb.toSafeStyles(), SafeHtmlUtils.fromTrustedString(text)));
  }

}
