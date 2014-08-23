package ru.formatq.gwtapp.theme.client;

public class ThemeDetailsImpl implements ThemeDetails {

  @Override
  public ru.formatq.gwtapp.theme.client.SplitBarDetails splitbar() {
  return new ru.formatq.gwtapp.theme.client.SplitBarDetails() {

  @Override
  public int handleWidth() {
  return 8;
  }

  @Override
  public java.lang.String dragColor() {
  return "#B4B4B4";
  }

  @Override
  public int handleHeight() {
  return 48;
  }

  @Override
  public double handleOpacity() {
  return 0.5;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MenuDetails menu() {
  return new ru.formatq.gwtapp.theme.client.MenuDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.MenuDetails.MenuBarDetails bar() {
  return new ru.formatq.gwtapp.theme.client.MenuDetails.MenuBarDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails activeItemBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails itemPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public int right() {
  return 8;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 8;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails hoverItemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String hoverItemGradient() {
  return "#d6e8f6 0%, #d6e8f6 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails itemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails activeItemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String itemLineHeight() {
  return "normal";
  }

  @Override
  public java.lang.String activeItemGradient() {
  return "#d6e8f6 0%, #d6e8f6 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails hoverItemBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#ffffff 0%, #ffffff 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String itemLineHeight() {
  return "normal";
  }

  @Override
  public java.lang.String gradient() {
  return "#ffffff 0%, #ffffff 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails itemPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails activeItemBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails itemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails activeItemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String activeItemGradient() {
  return "#d6e8f6 0%, #d6e8f6 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MenuDetails.MenuSeparatorDetails separator() {
  return new ru.formatq.gwtapp.theme.client.MenuDetails.MenuSeparatorDetails() {

  @Override
  public java.lang.String color() {
  return "#e1e1e1";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails margin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public int height() {
  return 1;
  }
    };
  }

  @Override
  public java.lang.String lastGradientColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MenuDetails.HeaderItemDetails header() {
  return new ru.formatq.gwtapp.theme.client.MenuDetails.HeaderItemDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails itemPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#D6E3F2";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails itemText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String itemLineHeight() {
  return "normal";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ColorPaletteDetails colorpalette() {
  return new ru.formatq.gwtapp.theme.client.ColorPaletteDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails itemPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public java.lang.String selectedBackgroundColor() {
  return "#e6e6e6";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails itemBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#e1e1e1";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails selectedBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#8bb8f3";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public int itemSize() {
  return 16;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ButtonDetails button() {
  return new ru.formatq.gwtapp.theme.client.ButtonDetails() {

  @Override
  public java.lang.String mediumFontSize() {
  return "14";
  }

  @Override
  public java.lang.String overGradient() {
  return "#479237, #33863D 50%, #307F47 51%, #33863D";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#4B9C28 0%, #38922C 50%, #358A37 51%, #38922C";
  }

  @Override
  public java.lang.String largeFontSize() {
  return "16";
  }

  @Override
  public java.lang.String smallLineHeight() {
  return "18";
  }

  @Override
  public java.lang.String largeLineHeight() {
  return "32";
  }

  @Override
  public java.lang.String pressedGradient() {
  return "#2A6D61, #276769 50%, #2A6D61 51%, #3F7B58";
  }

  @Override
  public java.lang.String arrowColor() {
  return "#ddeeff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String smallFontSize() {
  return "12";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String mediumLineHeight() {
  return "24";
  }

  @Override
  public int borderRadius() {
  return 4;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#126DAF";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MaskDetails mask() {
  return new ru.formatq.gwtapp.theme.client.MaskDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#000000";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MaskDetails.BoxDetails box() {
  return new ru.formatq.gwtapp.theme.client.MaskDetails.BoxDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#dddddd";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails textPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 21;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String borderStyle() {
  return "solid";
  }

  @Override
  public int borderWidth() {
  return 2;
  }

  @Override
  public java.lang.String borderColor() {
  return "#555555";
  }

  @Override
  public int radiusMinusBorderWidth() {
  return 0;
  }

  @Override
  public int borderRadius() {
  return 0;
  }

  @Override
  public java.lang.String loadingImagePosition() {
  return "0 center";
  }
    };
  }

  @Override
  public double opacity() {
  return 0.5;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.TreeDetails tree() {
  return new ru.formatq.gwtapp.theme.client.TreeDetails() {

  @Override
  public java.lang.String dropBackgroundColor() {
  return "#e2eff8";
  }

  @Override
  public java.lang.String selectedBackgroundColor() {
  return "#c1ddf1";
  }

  @Override
  public java.lang.String overBackgroundColor() {
  return "#e2eff8";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails iconMargin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 4;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String itemHeight() {
  return "25px";
  }

  @Override
  public java.lang.String dragOverBackgroundColor() {
  return "#e2eff8";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails nodePadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 6;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.TipDetails tip() {
  return new ru.formatq.gwtapp.theme.client.TipDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails messageText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails messagePadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public double opacity() {
  return 1.0;
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#cccccc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails headerText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails margin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String disabledTextColor() {
  return "";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FieldSetDetails fieldset() {
  return new ru.formatq.gwtapp.theme.client.FieldSetDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#bbbbbb";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String borderColor() {
  return "#2299cc";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.PanelDetails panel() {
  return new ru.formatq.gwtapp.theme.client.PanelDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 4;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String headerBackgroundColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String headerGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.DatePickerDetails datePicker() {
  return new ru.formatq.gwtapp.theme.client.DatePickerDetails() {

  @Override
  public java.lang.String itemOverColor() {
  return "#000000";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails itemSelectedText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails dayNextText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#bfbfbf";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String itemOverBackgroundColor() {
  return "#eaf3fa";
  }

  @Override
  public java.lang.String itemSelectedBackgroundColor() {
  return "#d6e8f6";
  }

  @Override
  public java.lang.String dayOfWeekBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails dayOfWeekText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails footerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails itemSelectedBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#3892d3";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String dayOfWeekLineHeight() {
  return "24px";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails dayOfWeekPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 9;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String dayDisabledBackgroundColor() {
  return "#eeeeee";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails todayBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#8b0000";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public java.lang.String dayPreviousBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails dayPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 8;
  }

  @Override
  public int right() {
  return 6;
  }

  @Override
  public int bottom() {
  return 8;
  }

  @Override
  public int left() {
  return 6;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String width() {
  return "212px";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails buttonMargin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails dayBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#ffffff";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails dayText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String headerBackgroundColor() {
  return "#f5f5f5";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerTextPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String footerBackgroundColor() {
  return "#f5f5f5";
  }

  @Override
  public java.lang.String dayNextBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public java.lang.String dayLineHeight() {
  return "23px";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails dayDisabledText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#808080";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails dayPreviousText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#bfbfbf";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#e1e1e1";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails headerText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ListViewDetails listview() {
  return new ru.formatq.gwtapp.theme.client.ListViewDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails overItem() {
  return new ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#5fb5da 0%, #4ba0c5 50%, #4894b5 51%, #4eadd6 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails selectedItem() {
  return new ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#38a3d1 0%, #38a3d1 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails item() {
  return new ru.formatq.gwtapp.theme.client.ListViewDetails.ItemDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#ffffff 0%, #ffffff 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String lineHeight() {
  return "normal";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FieldDetails field() {
  return new ru.formatq.gwtapp.theme.client.FieldDetails() {

  @Override
  public int invalidBorderWidth() {
  return 1;
  }

  @Override
  public java.lang.String borderStyle() {
  return "solid";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FieldDetails.FieldLabelDetails sideLabel() {
  return new ru.formatq.gwtapp.theme.client.FieldDetails.FieldLabelDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String textAlign() {
  return "left";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails fieldPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails labelPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String borderColor() {
  return "#c0c0c0";
  }

  @Override
  public java.lang.String focusBorderColor() {
  return "#3892d3";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FieldDetails.FieldLabelDetails topLabel() {
  return new ru.formatq.gwtapp.theme.client.FieldDetails.FieldLabelDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String textAlign() {
  return "left";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails fieldPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails labelPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 6;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String invalidBorderColor() {
  return "#D94E37";
  }

  @Override
  public java.lang.String emptyTextColor() {
  return "#808080";
  }

  @Override
  public java.lang.String invalidBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 6;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 6;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.SliderDetails slider() {
  return new ru.formatq.gwtapp.theme.client.SliderDetails() {

  @Override
  public int thumbRadius() {
  return 8;
  }

  @Override
  public java.lang.String trackBackgroundColor() {
  return "#f5f5f5";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails thumbBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#777777";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public int thumbHeight() {
  return 15;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails trackBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#d4d4d4";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public int trackRadius() {
  return 4;
  }

  @Override
  public java.lang.String thumbBackgroundColor() {
  return "#f5f5f5";
  }

  @Override
  public int thumbWidth() {
  return 15;
  }

  @Override
  public int trackHeight() {
  return 8;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public int borderWidth() {
  return 1;
  }

  @Override
  public java.lang.String lineHeight() {
  return "18px";
  }

  @Override
  public int height() {
  return 24;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.MessageBoxDetails messagebox() {
  return new ru.formatq.gwtapp.theme.client.MessageBoxDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails bodyPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails messagePadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 10;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails iconPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 10;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails grid() {
  return new ru.formatq.gwtapp.theme.client.GridDetails() {

  @Override
  public int cellBorderWidth() {
  return 1;
  }

  @Override
  public java.lang.String cellBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public java.lang.String cellOverHBorderStyle() {
  return "solid";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.GroupDetails group() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.GroupDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#f5f5f5";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 8;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 8;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.GroupDetails.SummaryDetails summary() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.GroupDetails.SummaryDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }
    };
  }

  @Override
  public int iconSpacing() {
  return 17;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#c0c0c0";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String cellSelectedVBorderColor() {
  return "#ededed";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.ColumnHeaderDetails columnHeader() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.ColumnHeaderDetails() {

  @Override
  public java.lang.String menuGradient() {
  return "#4eadd6 0%, #4eadd6 100%";
  }

  @Override
  public java.lang.String borderStyle() {
  return "solid";
  }

  @Override
  public java.lang.String borderColor() {
  return "#c0c0c0";
  }

  @Override
  public java.lang.String overGradient() {
  return "#5fb5da 0%, #4ba0c5 50%, #4894b5 51%, #4eadd6 100%";
  }

  @Override
  public java.lang.String gradient() {
  return "#87c7e3 0%, #78b8d3 50%, #76afc7 51%, #7ac1e0 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails menuBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#222222";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 10;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails menuHoverBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#222222";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String menuActiveGradient() {
  return "#2299cc 0%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails menuActiveBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#222222";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public int borderWidth() {
  return 0;
  }

  @Override
  public int menuButtonWidth() {
  return 18;
  }

  @Override
  public java.lang.String lineHeight() {
  return "normal";
  }

  @Override
  public java.lang.String menuHoverGradient() {
  return "#2299cc 0%, #2299cc 100%";
  }
    };
  }

  @Override
  public java.lang.String specialColumnGradientSelected() {
  return "";
  }

  @Override
  public java.lang.String cellSelectedVBorderStyle() {
  return "solid";
  }

  @Override
  public java.lang.String specialColumnGradient() {
  return "";
  }

  @Override
  public java.lang.String cellVBorderColor() {
  return "#ededed";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails cellText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String cellLineHeight() {
  return "normal";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails cellPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.FooterDetails footer() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.FooterDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails cellBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#ededed";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.RowEditorDetails rowEditor() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.RowEditorDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#DFEAF2";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#e1e1e1";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String cellSelectedHBorderColor() {
  return "#e2eff8";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.GridDetails.RowNumbererDetails rowNumberer() {
  return new ru.formatq.gwtapp.theme.client.GridDetails.RowNumbererDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String cellHBorderColor() {
  return "#ededed";
  }

  @Override
  public java.lang.String cellOverHBorderColor() {
  return "#e2eff8";
  }

  @Override
  public java.lang.String cellSelectedHBorderStyle() {
  return "solid";
  }

  @Override
  public java.lang.String cellOverBackgroundColor() {
  return "#e2eff8";
  }

  @Override
  public java.lang.String cellOverVBorderStyle() {
  return "solid";
  }

  @Override
  public java.lang.String cellSelectedBackgroundColor() {
  return "#c1ddf1";
  }

  @Override
  public java.lang.String cellAltBackgroundColor() {
  return "#fafafa";
  }

  @Override
  public java.lang.String cellOverVBorderColor() {
  return "#ededed";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ButtonGroupDetails buttonGroup() {
  return new ru.formatq.gwtapp.theme.client.ButtonGroupDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails bodyPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 4;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String headerGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String bodyBackgroundColor() {
  return "#FFFFFF";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.WindowDetails window() {
  return new ru.formatq.gwtapp.theme.client.WindowDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#2299cc";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String headerBackgroundColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String headerGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#1b7aa3";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ToolIconDetails tools() {
  return new ru.formatq.gwtapp.theme.client.ToolIconDetails() {

  @Override
  public java.lang.String warningColor() {
  return "#ff0000";
  }

  @Override
  public java.lang.String primaryClickColor() {
  return "#4eadd6";
  }

  @Override
  public java.lang.String primaryColor() {
  return "#ddeeff";
  }

  @Override
  public java.lang.String primaryOverColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String allowColor() {
  return "#00ff00";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.TipDetails errortip() {
  return new ru.formatq.gwtapp.theme.client.TipDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails messageText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails messagePadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public double opacity() {
  return 1.0;
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#dd2222";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails headerText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails margin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.TabDetails tabs() {
  return new ru.formatq.gwtapp.theme.client.TabDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails paddingWithClosable() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 19;
  }

  @Override
  public int right() {
  return 19;
  }

  @Override
  public int bottom() {
  return 19;
  }

  @Override
  public int left() {
  return 19;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails headingText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String tabItemBorderLeft() {
  return "1px solid #2299cc";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails tabTextPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 7;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 7;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String borderColor() {
  return "#2299cc";
  }

  @Override
  public int scrollerWidth() {
  return 18;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails paddingWithIcon() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 18;
  }

  @Override
  public int right() {
  return 18;
  }

  @Override
  public int bottom() {
  return 18;
  }

  @Override
  public int left() {
  return 18;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String tabStripGradient() {
  return "#176b8e 0%, #176b8e 100%";
  }

  @Override
  public java.lang.String gradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public int tabHeight() {
  return 25;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails tabStripPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String tabBarBorder() {
  return "none";
  }

  @Override
  public java.lang.String scrollerBackgroundColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String bodyBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 10;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String lastStopColor() {
  return "#2299cc";
  }

  @Override
  public int iconLeftOffset() {
  return 6;
  }

  @Override
  public java.lang.String tabBodyBorder() {
  return "1px solid #2299cc";
  }

  @Override
  public int tabBarBottomHeight() {
  return 2;
  }

  @Override
  public java.lang.String hoverGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public int tabSpacing() {
  return 5;
  }

  @Override
  public java.lang.String tabItemBorderRight() {
  return "1px solid #2299cc";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails hoverHeadingText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String tabItemBorderTop() {
  return "1px solid #2299cc";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails activeHeadingText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String inactiveGradient() {
  return "#277292 0%, #155f80 50%, #125572 51%, #176b8e 100%";
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public java.lang.String inactiveLastStopColor() {
  return "#176b8e";
  }

  @Override
  public java.lang.String tabStripBottomBorder() {
  return "1px solid #2299cc";
  }

  @Override
  public int iconTopOffset() {
  return 5;
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FramedPanelDetails framedPanel() {
  return new ru.formatq.gwtapp.theme.client.FramedPanelDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String headerBackgroundColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String headerGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.AccordionLayoutDetails accordionLayout() {
  return new ru.formatq.gwtapp.theme.client.AccordionLayoutDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 2;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 4;
  }

  @Override
  public int right() {
  return 4;
  }

  @Override
  public int bottom() {
  return 4;
  }

  @Override
  public int left() {
  return 4;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String headerBackgroundColor() {
  return "#2299cc";
  }

  @Override
  public java.lang.String headerGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public double disabledOpacity() {
  return 0.6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.StatusProxyDetails statusproxy() {
  return new ru.formatq.gwtapp.theme.client.StatusProxyDetails() {

  @Override
  public java.lang.String backgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public double opacity() {
  return 0.85;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#dddddd #bbbbbb #bbbbbb #dddddd";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ToolBarDetails toolbar() {
  return new ru.formatq.gwtapp.theme.client.ToolBarDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ToolBarDetails.LabelToolItemDetails labelItem() {
  return new ru.formatq.gwtapp.theme.client.ToolBarDetails.LabelToolItemDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 2;
  }

  @Override
  public int right() {
  return 2;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 2;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String lineHeight() {
  return "17px";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ButtonDetails buttonOverride() {
  return new ru.formatq.gwtapp.theme.client.ButtonDetails() {

  @Override
  public java.lang.String mediumFontSize() {
  return "14";
  }

  @Override
  public java.lang.String overGradient() {
  return "#479237, #33863D 50%, #307F47 51%, #33863D";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails font() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String gradient() {
  return "#4B9C28 0%, #38922C 50%, #358A37 51%, #38922C";
  }

  @Override
  public java.lang.String largeFontSize() {
  return "16";
  }

  @Override
  public java.lang.String smallLineHeight() {
  return "18";
  }

  @Override
  public java.lang.String largeLineHeight() {
  return "32";
  }

  @Override
  public java.lang.String pressedGradient() {
  return "#2A6D61, #276769 50%, #2A6D61 51%, #3F7B58";
  }

  @Override
  public java.lang.String arrowColor() {
  return "#ddeeff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String smallFontSize() {
  return "12";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 3;
  }

  @Override
  public int right() {
  return 3;
  }

  @Override
  public int bottom() {
  return 3;
  }

  @Override
  public int left() {
  return 3;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String mediumLineHeight() {
  return "24";
  }

  @Override
  public int borderRadius() {
  return 4;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#126DAF";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.ProgressBarDetails progressbar() {
  return new ru.formatq.gwtapp.theme.client.ProgressBarDetails() {

  @Override
  public java.lang.String backgroundGradient() {
  return "#2299cc 0%, #2299cc 100%";
  }

  @Override
  public java.lang.String barTextColor() {
  return "#eeffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails textPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 5;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 5;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails barBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public java.lang.String barGradient() {
  return "#38a3d1 0%, #1e89b7 50%, #1b7aa3 51%, #2299cc 100%";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#eeffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String textAlign() {
  return "center";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.InfoDetails info() {
  return new ru.formatq.gwtapp.theme.client.InfoDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails messageText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#ffffff";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String backgroundColor() {
  return "#000000";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails messagePadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails headerPadding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 10;
  }

  @Override
  public int right() {
  return 10;
  }

  @Override
  public int bottom() {
  return 10;
  }

  @Override
  public int left() {
  return 10;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails radiusMinusBorderWidth() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 6;
  }

  @Override
  public int right() {
  return 6;
  }

  @Override
  public int bottom() {
  return 6;
  }

  @Override
  public int left() {
  return 6;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public double opacity() {
  return 0.8;
  }

  @Override
  public int borderRadius() {
  return 6;
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String style() {
  return "none";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails headerText() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#ffffff";
  }

  @Override
  public java.lang.String size() {
  return "15px";
  }

  @Override
  public java.lang.String weight() {
  return "bold";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails margin() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 4;
  }

  @Override
  public int right() {
  return 0;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 0;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.StatusDetails status() {
  return new ru.formatq.gwtapp.theme.client.StatusDetails() {

  @Override
  public ru.formatq.gwtapp.theme.client.EdgeDetails padding() {
  return new ru.formatq.gwtapp.theme.client.EdgeDetails() {

  @Override
  public int top() {
  return 0;
  }

  @Override
  public int right() {
  return 5;
  }

  @Override
  public int bottom() {
  return 0;
  }

  @Override
  public int left() {
  return 5;
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.FontDetails text() {
  return new ru.formatq.gwtapp.theme.client.FontDetails() {

  @Override
  public java.lang.String color() {
  return "#000000";
  }

  @Override
  public java.lang.String size() {
  return "13px";
  }

  @Override
  public java.lang.String weight() {
  return "normal";
  }

  @Override
  public java.lang.String family() {
  return "Tahoma, Arial, Verdana, sans-serif";
  }
    };
  }

  @Override
  public java.lang.String lineHeight() {
  return "16px";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails border() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#cccccc #d9d9d9 #d9d9d9";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderLayoutDetails borderLayout() {
  return new ru.formatq.gwtapp.theme.client.BorderLayoutDetails() {

  @Override
  public java.lang.String panelBackgroundColor() {
  return "#ffffff";
  }

  @Override
  public ru.formatq.gwtapp.theme.client.BorderDetails collapsePanelBorder() {
  return new ru.formatq.gwtapp.theme.client.BorderDetails() {

  @Override
  public int top() {
  return 1;
  }

  @Override
  public java.lang.String color() {
  return "#2299cc";
  }

  @Override
  public int right() {
  return 1;
  }

  @Override
  public int bottom() {
  return 1;
  }

  @Override
  public int left() {
  return 1;
  }

  @Override
  public java.lang.String style() {
  return "solid";
  }

  @Override
  public java.lang.String toString () {
    return top() + "px " + right() + "px " + bottom() + "px " + left() + "px";
  }
    };
  }
    };
  }
public String getName() {return "theme";}

}

