package com.thinkmobiles.easyerp.presentation.managers;

import com.thinkmobiles.easyerp.R;

/**
 * Created by Lynx on 1/16/2017.
 */

public abstract class TagHelper {
    /**
     * "tag_bg_red
     "tag_bg_pink
     "tag_bg_orange
     "tag_bg_yellow
     "tag_bg_green_dark
     "tag_bg_green_light
     "tag_bg_blue_light
     "tag_bg_blue_dark
     "tag_bg_purple
     "tag_bg_black
     "tag_bg_grey
     */

    private static final String COLOR_RED           = "bgRed";
    private static final String COLOR_PINK          = "bgPink";
    private static final String COLOR_ORANGE        = "bgOrange";
    private static final String COLOR_YELLOW        = "bgYellow";
    private static final String COLOR_GREEN_DARK    = "bgGreenDark";
    private static final String COLOR_GREEN_LIGHT   = "bgGreenLight";
    private static final String COLOR_BLUE_LIGHT    = "bgBlueLight";
    private static final String COLOR_BLUE_DARK     = "bgBlueDark";
    private static final String COLOR_PURPLE        = "bgPurple";
    private static final String COLOR_BLACK         = "bgBlack";
    private static final String COLOR_GREY          = "bgGrey";

    public static final String COLD                 = "Cold";
    public static final String MEDIUM               = "Med";
    public static final String HOT                  = "Hot";

    public static final String PENDING_PO           = "Pending PO";
    public static final String PRODUCT_RECEIVED     = "Product received";
    public static final String ON_HOLD              = "On hold";
    public static final String DRAFT_QUOTATION      = "Draft/ Quotation";
    public static final String NEW_ORDER            = "New Order";
    public static final String PROCESSING           = "Processing";
    public static final String CANCELLED            = "Cancelled";
    public static final String INVOICED             = "Invoiced";
    public static final String INVOICED_RECEIVED    = "Invoiced received";

    public static int getColorResIdByName(String colorName) {
        switch (colorName) {
            case COLOR_RED:
                return R.color.tag_bg_red;
            case COLOR_PINK:
                return R.color.tag_bg_pink;
            case COLOR_ORANGE:
                return R.color.tag_bg_orange;
            case COLOR_YELLOW:
                return R.color.tag_bg_yellow;
            case COLOR_GREEN_DARK:
                return R.color.tag_bg_green_dark;
            case COLOR_GREEN_LIGHT:
                return R.color.tag_bg_green_light;
            case COLOR_BLUE_LIGHT:
                return R.color.tag_bg_blue_light;
            case COLOR_BLUE_DARK:
                return R.color.tag_bg_blue_dark;
            case COLOR_PURPLE:
                return R.color.tag_bg_purple;
            case COLOR_BLACK:
                return R.color.tag_bg_black;
            case COLOR_GREY:
                return R.color.tag_bg_grey;

            case COLD:
                return R.color.color_chips_blue;
            case MEDIUM:
                return R.color.color_chips_orange;
            case HOT:
                return R.color.color_chips_red;

            case PENDING_PO:
                return R.color.color_chips_grey;
            case PRODUCT_RECEIVED:
                return R.color.color_chips_grey;
            case ON_HOLD:
                return R.color.color_chips_grey;
            case DRAFT_QUOTATION:
                return R.color.color_chips_grey;
            case NEW_ORDER:
                return R.color.color_chips_grey;
            case PROCESSING:
                return R.color.color_chips_light_blue;
            case CANCELLED:
                return R.color.color_chips_grey;
            case INVOICED:
                return R.color.color_chips_green;
            case INVOICED_RECEIVED:
                return R.color.color_chips_green;
            default:
                return R.color.tag_bg_grey;
        }
    }
}
