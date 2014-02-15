package org.gwtbootstrap3.client.ui.constants;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap3.client.ui.base.helper.EnumHelper;

/**
 * You can use the fontawesome-enum-helper.js to grab and enum names (located in the client/resource/css folder
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public enum IconType implements Type, Style.HasCssName {
    ADJUST("fa-adjust"),
    ADN("fa-adn"),
    ALIGN_CENTER("fa-align-center"),
    ALIGN_JUSTIFY("fa-align-justify"),
    ALIGN_LEFT("fa-align-left"),
    ALIGN_RIGHT("fa-align-right"),
    AMBULANCE("fa-ambulance"),
    ANCHOR("fa-anchor"),
    ANDROID("fa-android"),
    ANGLE_DOUBLE_DOWN("fa-angle-double-down"),
    ANGLE_DOUBLE_LEFT("fa-angle-double-left"),
    ANGLE_DOUBLE_RIGHT("fa-angle-double-right"),
    ANGLE_DOUBLE_UP("fa-angle-double-up"),
    ANGLE_DOWN("fa-angle-down"),
    ANGLE_LEFT("fa-angle-left"),
    ANGLE_RIGHT("fa-angle-right"),
    ANGLE_UP("fa-angle-up"),
    APPLE("fa-apple"),
    ARCHIVE("fa-archive"),
    ARROWS("fa-arrows"),
    ARROWS_ALT("fa-arrows-alt"),
    ARROWS_H("fa-arrows-h"),
    ARROWS_V("fa-arrows-v"),
    ARROW_CIRCLE_DOWN("fa-arrow-circle-down"),
    ARROW_CIRCLE_LEFT("fa-arrow-circle-left"),
    ARROW_CIRCLE_O_DOWN("fa-arrow-circle-o-down"),
    ARROW_CIRCLE_O_LEFT("fa-arrow-circle-o-left"),
    ARROW_CIRCLE_O_RIGHT("fa-arrow-circle-o-right"),
    ARROW_CIRCLE_O_UP("fa-arrow-circle-o-up"),
    ARROW_CIRCLE_RIGHT("fa-arrow-circle-right"),
    ARROW_CIRCLE_UP("fa-arrow-circle-up"),
    ARROW_DOWN("fa-arrow-down"),
    ARROW_LEFT("fa-arrow-left"),
    ARROW_RIGHT("fa-arrow-right"),
    ARROW_UP("fa-arrow-up"),
    ASTERISK("fa-asterisk"),
    BACKWARD("fa-backward"),
    BAN("fa-ban"),
    BARCODE("fa-barcode"),
    BARS("fa-bars"),
    BAR_CHART_O("fa-bar-chart-o"),
    BEER("fa-beer"),
    BELL("fa-bell"),
    BELL_O("fa-bell-o"),
    BITBUCKET("fa-bitbucket"),
    BITBUCKET_SQUARE("fa-bitbucket-square"),
    BITCOIN("fa-bitcoin"),
    BOLD("fa-bold"),
    BOLT("fa-bolt"),
    BOOK("fa-book"),
    BOOKMARK("fa-bookmark"),
    BOOKMARK_O("fa-bookmark-o"),
    BRIEFCASE("fa-briefcase"),
    BTC("fa-btc"),
    BUG("fa-bug"),
    BUILDING_O("fa-building-o"),
    BULLHORN("fa-bullhorn"),
    BULLSEYE("fa-bullseye"),
    CALENDAR("fa-calendar"),
    CALENDAR_O("fa-calendar-o"),
    CAMERA("fa-camera"),
    CAMERA_RETRO("fa-camera-retro"),
    CARET_DOWN("fa-caret-down"),
    CARET_LEFT("fa-caret-left"),
    CARET_RIGHT("fa-caret-right"),
    CARET_SQUARE_O_DOWN("fa-caret-square-o-down"),
    CARET_SQUARE_O_LEFT("fa-caret-square-o-left"),
    CARET_SQUARE_O_RIGHT("fa-caret-square-o-right"),
    CARET_SQUARE_O_UP("fa-caret-square-o-up"),
    CARET_UP("fa-caret-up"),
    CERTIFICATE("fa-certificate"),
    CHAIN("fa-chain"),
    CHAIN_BROKEN("fa-chain-broken"),
    CHECK("fa-check"),
    CHECK_CIRCLE("fa-check-circle"),
    CHECK_CIRCLE_O("fa-check-circle-o"),
    CHECK_SQUARE("fa-check-square"),
    CHECK_SQUARE_O("fa-check-square-o"),
    CHEVRON_CIRCLE_DOWN("fa-chevron-circle-down"),
    CHEVRON_CIRCLE_LEFT("fa-chevron-circle-left"),
    CHEVRON_CIRCLE_RIGHT("fa-chevron-circle-right"),
    CHEVRON_CIRCLE_UP("fa-chevron-circle-up"),
    CHEVRON_DOWN("fa-chevron-down"),
    CHEVRON_LEFT("fa-chevron-left"),
    CHEVRON_RIGHT("fa-chevron-right"),
    CHEVRON_UP("fa-chevron-up"),
    CIRCLE("fa-circle"),
    CIRCLE_O("fa-circle-o"),
    CLIPBOARD("fa-clipboard"),
    CLOCK_O("fa-clock-o"),
    CLOUD("fa-cloud"),
    CLOUD_DOWNLOAD("fa-cloud-download"),
    CLOUD_UPLOAD("fa-cloud-upload"),
    CNY("fa-cny"),
    CODE("fa-code"),
    CODE_FORK("fa-code-fork"),
    COFFEE("fa-coffee"),
    COG("fa-cog"),
    COGS("fa-cogs"),
    COLUMNS("fa-columns"),
    COMMENT("fa-comment"),
    COMMENTS("fa-comments"),
    COMMENTS_O("fa-comments-o"),
    COMMENT_O("fa-comment-o"),
    COMPASS("fa-compass"),
    COMPRESS("fa-compress"),
    COPY("fa-copy"),
    CREDIT_CARD("fa-credit-card"),
    CROP("fa-crop"),
    CROSSHAIRS("fa-crosshairs"),
    CSS3("fa-css3"),
    CUT("fa-cut"),
    CUTLERY("fa-cutlery"),
    DASHBOARD("fa-dashboard"),
    DEDENT("fa-dedent"),
    DESKTOP("fa-desktop"),
    DOLLAR("fa-dollar"),
    DOT_CIRCLE_O("fa-dot-circle-o"),
    DOWNLOAD("fa-download"),
    DRIBBBLE("fa-dribbble"),
    DROPBOX("fa-dropbox"),
    EDIT("fa-edit"),
    EJECT("fa-eject"),
    ELLIPSIS_H("fa-ellipsis-h"),
    ELLIPSIS_V("fa-ellipsis-v"),
    ENVELOPE("fa-envelope"),
    ENVELOPE_O("fa-envelope-o"),
    ERASER("fa-eraser"),
    EUR("fa-eur"),
    EURO("fa-euro"),
    EXCHANGE("fa-exchange"),
    EXCLAMATION("fa-exclamation"),
    EXCLAMATION_CIRCLE("fa-exclamation-circle"),
    EXCLAMATION_TRIANGLE("fa-exclamation-triangle"),
    EXPAND("fa-expand"),
    EXTERNAL_LINK("fa-external-link"),
    EXTERNAL_LINK_SQUARE("fa-external-link-square"),
    EYE("fa-eye"),
    EYE_SLASH("fa-eye-slash"),
    FACEBOOK("fa-facebook"),
    FACEBOOK_SQUARE("fa-facebook-square"),
    FAST_BACKWARD("fa-fast-backward"),
    FAST_FORWARD("fa-fast-forward"),
    FEMALE("fa-female"),
    FIGHTER_JET("fa-fighter-jet"),
    FILE("fa-file"),
    FILES_O("fa-files-o"),
    FILE_O("fa-file-o"),
    FILE_TEXT("fa-file-text"),
    FILE_TEXT_O("fa-file-text-o"),
    FILM("fa-film"),
    FILTER("fa-filter"),
    FIRE("fa-fire"),
    FIRE_EXTINGUISHER("fa-fire-extinguisher"),
    FLAG("fa-flag"),
    FLAG_CHECKERED("fa-flag-checkered"),
    FLAG_O("fa-flag-o"),
    FLASH("fa-flash"),
    FLASK("fa-flask"),
    FLICKR("fa-flickr"),
    FLOPPY_O("fa-floppy-o"),
    FOLDER("fa-folder"),
    FOLDER_O("fa-folder-o"),
    FOLDER_OPEN("fa-folder-open"),
    FOLDER_OPEN_O("fa-folder-open-o"),
    FONT("fa-font"),
    FORWARD("fa-forward"),
    FOURSQUARE("fa-foursquare"),
    FROWN_O("fa-frown-o"),
    GAMEPAD("fa-gamepad"),
    GAVEL("fa-gavel"),
    GBP("fa-gbp"),
    GEAR("fa-gear"),
    GEARS("fa-gears"),
    GIFT("fa-gift"),
    GITHUB("fa-github"),
    GITHUB_ALT("fa-github-alt"),
    GITHUB_SQUARE("fa-github-square"),
    GITTIP("fa-gittip"),
    GLASS("fa-glass"),
    GLOBE("fa-globe"),
    GOOGLE_PLUS("fa-google-plus"),
    GOOGLE_PLUS_SQUARE("fa-google-plus-square"),
    GROUP("fa-group"),
    HAND_O_DOWN("fa-hand-o-down"),
    HAND_O_LEFT("fa-hand-o-left"),
    HAND_O_RIGHT("fa-hand-o-right"),
    HAND_O_UP("fa-hand-o-up"),
    HDD_O("fa-hdd-o"),
    HEADPHONES("fa-headphones"),
    HEART("fa-heart"),
    HEART_O("fa-heart-o"),
    HOME("fa-home"),
    HOSPITAL_O("fa-hospital-o"),
    HTML5("fa-html5"),
    H_SQUARE("fa-h-square"),
    INBOX("fa-inbox"),
    INDENT("fa-indent"),
    INFO("fa-info"),
    INFO_CIRCLE("fa-info-circle"),
    INR("fa-inr"),
    INSTAGRAM("fa-instagram"),
    ITALIC("fa-italic"),
    JPY("fa-jpy"),
    KEY("fa-key"),
    KEYBOARD_O("fa-keyboard-o"),
    KRW("fa-krw"),
    LAPTOP("fa-laptop"),
    LEAF("fa-leaf"),
    LEGAL("fa-legal"),
    LEMON_O("fa-lemon-o"),
    LEVEL_DOWN("fa-level-down"),
    LEVEL_UP("fa-level-up"),
    LIGHTBULB_O("fa-lightbulb-o"),
    LINK("fa-link"),
    LINKEDIN("fa-linkedin"),
    LINKEDIN_SQUARE("fa-linkedin-square"),
    LINUX("fa-linux"),
    LIST("fa-list"),
    LIST_ALT("fa-list-alt"),
    LIST_OL("fa-list-ol"),
    LIST_UL("fa-list-ul"),
    LOCATION_ARROW("fa-location-arrow"),
    LOCK("fa-lock"),
    LONG_ARROW_DOWN("fa-long-arrow-down"),
    LONG_ARROW_LEFT("fa-long-arrow-left"),
    LONG_ARROW_RIGHT("fa-long-arrow-right"),
    LONG_ARROW_UP("fa-long-arrow-up"),
    MAGIC("fa-magic"),
    MAGNET("fa-magnet"),
    MAIL_FORWARD("fa-mail-forward"),
    MAIL_REPLY("fa-mail-reply"),
    MAIL_REPLY_ALL("fa-mail-reply-all"),
    MALE("fa-male"),
    MAP_MARKER("fa-map-marker"),
    MAXCDN("fa-maxcdn"),
    MEDKIT("fa-medkit"),
    MEH_O("fa-meh-o"),
    MICROPHONE("fa-microphone"),
    MICROPHONE_SLASH("fa-microphone-slash"),
    MINUS("fa-minus"),
    MINUS_CIRCLE("fa-minus-circle"),
    MINUS_SQUARE("fa-minus-square"),
    MINUS_SQUARE_O("fa-minus-square-o"),
    MOBILE("fa-mobile"),
    MOBILE_PHONE("fa-mobile-phone"),
    MONEY("fa-money"),
    MOON_O("fa-moon-o"),
    MUSIC("fa-music"),
    OUTDENT("fa-outdent"),
    PAGELINES("fa-pagelines"),
    PAPERCLIP("fa-paperclip"),
    PASTE("fa-paste"),
    PAUSE("fa-pause"),
    PENCIL("fa-pencil"),
    PENCIL_SQUARE("fa-pencil-square"),
    PENCIL_SQUARE_O("fa-pencil-square-o"),
    PHONE("fa-phone"),
    PHONE_SQUARE("fa-phone-square"),
    PICTURE_O("fa-picture-o"),
    PINTEREST("fa-pinterest"),
    PINTEREST_SQUARE("fa-pinterest-square"),
    PLANE("fa-plane"),
    PLAY("fa-play"),
    PLAY_CIRCLE("fa-play-circle"),
    PLAY_CIRCLE_O("fa-play-circle-o"),
    PLUS("fa-plus"),
    PLUS_CIRCLE("fa-plus-circle"),
    PLUS_SQUARE("fa-plus-square"),
    PLUS_SQUARE_O("fa-plus-square-o"),
    POWER_OFF("fa-power-off"),
    PRINT("fa-print"),
    PUZZLE_PIECE("fa-puzzle-piece"),
    QRCODE("fa-qrcode"),
    QUESTION("fa-question"),
    QUESTION_CIRCLE("fa-question-circle"),
    QUOTE_LEFT("fa-quote-left"),
    QUOTE_RIGHT("fa-quote-right"),
    RANDOM("fa-random"),
    REFRESH("fa-refresh"),
    RENREN("fa-renren"),
    REPEAT("fa-repeat"),
    REPLY("fa-reply"),
    REPLY_ALL("fa-reply-all"),
    RETWEET("fa-retweet"),
    RMB("fa-rmb"),
    ROAD("fa-road"),
    ROCKET("fa-rocket"),
    ROTATE_LEFT("fa-rotate-left"),
    ROTATE_RIGHT("fa-rotate-right"),
    ROUBLE("fa-rouble"),
    RSS("fa-rss"),
    RSS_SQUARE("fa-rss-square"),
    RUB("fa-rub"),
    RUBLE("fa-ruble"),
    RUPEE("fa-rupee"),
    SAVE("fa-save"),
    SCISSORS("fa-scissors"),
    SEARCH("fa-search"),
    SEARCH_MINUS("fa-search-minus"),
    SEARCH_PLUS("fa-search-plus"),
    SHARE("fa-share"),
    SHARE_SQUARE("fa-share-square"),
    SHARE_SQUARE_O("fa-share-square-o"),
    SHIELD("fa-shield"),
    SHOPPING_CART("fa-shopping-cart"),
    SIGNAL("fa-signal"),
    SIGN_IN("fa-sign-in"),
    SIGN_OUT("fa-sign-out"),
    SITEMAP("fa-sitemap"),
    SKYPE("fa-skype"),
    SMILE_O("fa-smile-o"),
    SORT("fa-sort"),
    SORT_ALPHA_ASC("fa-sort-alpha-asc"),
    SORT_ALPHA_DESC("fa-sort-alpha-desc"),
    SORT_AMOUNT_ASC("fa-sort-amount-asc"),
    SORT_AMOUNT_DESC("fa-sort-amount-desc"),
    SORT_ASC("fa-sort-asc"),
    SORT_DESC("fa-sort-desc"),
    SORT_DOWN("fa-sort-down"),
    SORT_NUMERIC_ASC("fa-sort-numeric-asc"),
    SORT_NUMERIC_DESC("fa-sort-numeric-desc"),
    SORT_UP("fa-sort-up"),
    SPINNER("fa-spinner"),
    SQUARE("fa-square"),
    SQUARE_O("fa-square-o"),
    STACK_EXCHANGE("fa-stack-exchange"),
    STACK_OVERFLOW("fa-stack-overflow"),
    STAR("fa-star"),
    STAR_HALF("fa-star-half"),
    STAR_HALF_EMPTY("fa-star-half-empty"),
    STAR_HALF_FULL("fa-star-half-full"),
    STAR_HALF_O("fa-star-half-o"),
    STAR_O("fa-star-o"),
    STEP_BACKWARD("fa-step-backward"),
    STEP_FORWARD("fa-step-forward"),
    STETHOSCOPE("fa-stethoscope"),
    STOP("fa-stop"),
    STRIKETHROUGH("fa-strikethrough"),
    SUBSCRIPT("fa-subscript"),
    SUITCASE("fa-suitcase"),
    SUN_O("fa-sun-o"),
    SUPERSCRIPT("fa-superscript"),
    TABLE("fa-table"),
    TABLET("fa-tablet"),
    TACHOMETER("fa-tachometer"),
    TAG("fa-tag"),
    TAGS("fa-tags"),
    TASKS("fa-tasks"),
    TERMINAL("fa-terminal"),
    TEXT_HEIGHT("fa-text-height"),
    TEXT_WIDTH("fa-text-width"),
    TH("fa-th"),
    THUMBS_DOWN("fa-thumbs-down"),
    THUMBS_O_DOWN("fa-thumbs-o-down"),
    THUMBS_O_UP("fa-thumbs-o-up"),
    THUMBS_UP("fa-thumbs-up"),
    THUMB_TACK("fa-thumb-tack"),
    TH_LARGE("fa-th-large"),
    TH_LIST("fa-th-list"),
    TICKET("fa-ticket"),
    TIMES("fa-times"),
    TIMES_CIRCLE("fa-times-circle"),
    TIMES_CIRCLE_O("fa-times-circle-o"),
    TINT("fa-tint"),
    TOGGLE_DOWN("fa-toggle-down"),
    TOGGLE_LEFT("fa-toggle-left"),
    TOGGLE_RIGHT("fa-toggle-right"),
    TOGGLE_UP("fa-toggle-up"),
    TRASH_O("fa-trash-o"),
    TRELLO("fa-trello"),
    TROPHY("fa-trophy"),
    TRUCK("fa-truck"),
    TRY("fa-try"),
    TUMBLR("fa-tumblr"),
    TUMBLR_SQUARE("fa-tumblr-square"),
    TURKISH_LIRA("fa-turkish-lira"),
    TWITTER("fa-twitter"),
    TWITTER_SQUARE("fa-twitter-square"),
    UMBRELLA("fa-umbrella"),
    UNDERLINE("fa-underline"),
    UNDO("fa-undo"),
    UNLINK("fa-unlink"),
    UNLOCK("fa-unlock"),
    UNLOCK_ALT("fa-unlock-alt"),
    UNSORTED("fa-unsorted"),
    UPLOAD("fa-upload"),
    USD("fa-usd"),
    USER("fa-user"),
    USERS("fa-users"),
    USER_MD("fa-user-md"),
    VIDEO_CAMERA("fa-video-camera"),
    VIMEO_SQUARE("fa-vimeo-square"),
    VK("fa-vk"),
    VOLUME_DOWN("fa-volume-down"),
    VOLUME_OFF("fa-volume-off"),
    VOLUME_UP("fa-volume-up"),
    WARNING("fa-warning"),
    WEIBO("fa-weibo"),
    WHEELCHAIR("fa-wheelchair"),
    WINDOWS("fa-windows"),
    WON("fa-won"),
    WRENCH("fa-wrench"),
    XING("fa-xing"),
    XING_SQUARE("fa-xing-square"),
    YEN("fa-yen"),
    YOUTUBE("fa-youtube"),
    YOUTUBE_PLAY("fa-youtube-play"),
    YOUTUBE_SQUARE("fa-youtube-square");

    private final String cssClass;

    private IconType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static IconType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, IconType.class, null);
    }
}
