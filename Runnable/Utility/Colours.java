package Utility;

import java.awt.*;
import java.lang.reflect.Field;

public class Colours {

///  Google Colour Palette   ///

///  RED   ///
public static String RED_50 = "#ffebee";
public static String RED_100 = "#ffcdd2";
public static String RED_200 = "#ef9a9a";
public static String RED_300 = "#e57373";
public static String RED_400 = "#ef5350";
public static String RED_500 = "#f44336";
public static String RED_600 = "#e53935";
public static String RED_700 = "#d32f2f";
public static String RED_800 = "#c62828";
public static String RED_900 = "#b71c1c";

public static String RED_A100 = "#ff8a80";
public static String RED_A200 = "#ff5252";
public static String RED_A400 = "#ff1744";
public static String RED_A700 = "#d50000";


///  PINK   ///
public static String PINK_50 = "#fce4ec";
public static String PINK_100 = "#f8bbd0";
public static String PINK_200 = "#f48fb1";
public static String PINK_300 = "#f06292";
public static String PINK_400 = "#ec407a";
public static String PINK_500 = "#e91e63";
public static String PINK_600 = "#d81b60";
public static String PINK_700 = "#c2185b";
public static String PINK_800 = "#ad1457";
public static String PINK_900 = "#880e4f";

public static String PINK_A100 = "#ff80ab";
public static String PINK_A200 = "#ff4081";
public static String PINK_A400 = "#f50057";
public static String PINK_A700 = "#c51162";


///  PURPLE   ///
public static String PURPLE_50 = "#f3e5f5";
public static String PURPLE_100 = "#e1bee7";
public static String PURPLE_200 = "#ce93d8";
public static String PURPLE_300 = "#ba68c8";
public static String PURPLE_400 = "#ab47bc";
public static String PURPLE_500 = "#9c27b0";
public static String PURPLE_600 = "#8e24aa";
public static String PURPLE_700 = "#7b1fa2";
public static String PURPLE_800 = "#6a1b9a";
public static String PURPLE_900 = "#4a148c";

public static String PURPLE_A100 = "#ea80fc";
public static String PURPLE_A200 = "#e040fb";
public static String PURPLE_A400 = "#d500f9";
public static String PURPLE_A700 = "#aa00ff";



///  DEEPPURPLE   ///
public static String DEEPPURPLE_50 = "#ede7f6";
public static String DEEPPURPLE_100 = "#d1c4e9";
public static String DEEPPURPLE_200 = "#b39ddb";
public static String DEEPPURPLE_300 = "#9575cd";
public static String DEEPPURPLE_400 = "#7e57c2";
public static String DEEPPURPLE_500 = "#673ab7";
public static String DEEPPURPLE_600 = "#5e35b1";
public static String DEEPPURPLE_700 = "#512da8";
public static String DEEPPURPLE_800 = "#4527a0";
public static String DEEPPURPLE_900 = "#311b92";

public static String DEEPPURPLE_A100 = "#b388ff";
public static String DEEPPURPLE_A200 = "#7c4dff";
public static String DEEPPURPLE_A400 = "#651fff";
public static String DEEPPURPLE_A700 = "#6200ea";


///  INDIGO   ///
public static String INDIGO_50 = "#e8eaf6";
public static String INDIGO_100 = "#c5cae9";
public static String INDIGO_200 = "#9fa8da";
public static String INDIGO_300 = "#7986cb";
public static String INDIGO_400 = "#5c6bc0";
public static String INDIGO_500 = "#3f51b5";
public static String INDIGO_600 = "#3949ab";
public static String INDIGO_700 = "#303f9f";
public static String INDIGO_800 = "#283593";
public static String INDIGO_900 = "#1a237e";

public static String INDIGO_A100 = "#8c9eff";
public static String INDIGO_A200 = "#536dfe";
public static String INDIGO_A400 = "#3d5afe";
public static String INDIGO_A700 = "#304ffe";


///  BLUE   ///
public static String BLUE_50 = "#e3f2fd";
public static String BLUE_100 = "#bbdefb";
public static String BLUE_200 = "#90caf9";
public static String BLUE_300 = "#64b5f6";
public static String BLUE_400 = "#42a5f5";
public static String BLUE_500 = "#2196f3";
public static String BLUE_600 = "#1e88e5";
public static String BLUE_700 = "#1976d2";
public static String BLUE_800 = "#1565c0";
public static String BLUE_900 = "#0d47a1";

public static String BLUE_A100 = "#82b1ff";
public static String BLUE_A200 = "#448aff";
public static String BLUE_A400 = "#2979ff";
public static String BLUE_A700 = "#2962ff";


///  LIGHTBLUE   ///
public static String LIGHTBLUE_50 = "#e1f5fe";
public static String LIGHTBLUE_100 = "#b3e5fc";
public static String LIGHTBLUE_200 = "#81d4fa";
public static String LIGHTBLUE_300 = "#4fc3f7";
public static String LIGHTBLUE_400 = "#29b6f6";
public static String LIGHTBLUE_500 = "#03a9f4";
public static String LIGHTBLUE_600 = "#039be5";
public static String LIGHTBLUE_700 = "#0288d1";
public static String LIGHTBLUE_800 = "#0277bd";
public static String LIGHTBLUE_900 = "#01579b";

public static String LIGHTBLUE_A100 = "#80d8ff";
public static String LIGHTBLUE_A200 = "#40c4ff";
public static String LIGHTBLUE_A400 = "#00b0ff";
public static String LIGHTBLUE_A700 = "#0091ea";


///  CYAN   ///
public static String CYAN_50 = "#e0f7fa";
public static String CYAN_100 = "#b2ebf2";
public static String CYAN_200 = "#80deea";
public static String CYAN_300 = "#4dd0e1";
public static String CYAN_400 = "#26c6da";
public static String CYAN_500 = "#00bcd4";
public static String CYAN_600 = "#00acc1";
public static String CYAN_700 = "#0097a7";
public static String CYAN_800 = "#00838f";
public static String CYAN_900 = "#006064";

public static String CYAN_A100 = "#84ffff";
public static String CYAN_A200 = "#18ffff";
public static String CYAN_A400 = "#00e5ff";
public static String CYAN_A700 = "#00b8d4";


///  TEAL   ///
public static String TEAL_50 = "#e0f2f1";
public static String TEAL_100 = "#b2dfdb";
public static String TEAL_200 = "#80cbc4";
public static String TEAL_300 = "#4db6ac";
public static String TEAL_400 = "#26a69a";
public static String TEAL_500 = "#009688";
public static String TEAL_600 = "#00897b";
public static String TEAL_700 = "#00796b";
public static String TEAL_800 = "#00695c";
public static String TEAL_900 = "#004d40";

public static String TEAL_A100 = "#a7ffeb";
public static String TEAL_A200 = "#64ffda";
public static String TEAL_A400 = "#1de9b6";
public static String TEAL_A700 = "#00bfa5";


///  GREEN   ///
public static String GREEN_50 = "#e8f5e9";
public static String GREEN_100 = "#c8e6c9";
public static String GREEN_200 = "#a5d6a7";
public static String GREEN_300 = "#81c784";
public static String GREEN_400 = "#66bb6a";
public static String GREEN_500 = "#4caf50";
public static String GREEN_600 = "#43a047";
public static String GREEN_700 = "#388e3c";
public static String GREEN_800 = "#2e7d32";
public static String GREEN_900 = "#1b5e20";

public static String GREEN_A100 = "#b9f6ca";
public static String GREEN_A200 = "#69f0ae";
public static String GREEN_A400 = "#00e676";
public static String GREEN_A700 = "#00c853";


///  LIGHTGREEN   ///
public static String LIGHTGREEN_50 = "#f1f8e9";
public static String LIGHTGREEN_100 = "#dcedc8";
public static String LIGHTGREEN_200 = "#c5e1a5";
public static String LIGHTGREEN_300 = "#aed581";
public static String LIGHTGREEN_400 = "#9ccc65";
public static String LIGHTGREEN_500 = "#8bc34a";
public static String LIGHTGREEN_600 = "#7cb342";
public static String LIGHTGREEN_700 = "#689f38";
public static String LIGHTGREEN_800 = "#558b2f";
public static String LIGHTGREEN_900 = "#33691e";

public static String LIGHTGREEN_A100 = "#ccff90";
public static String LIGHTGREEN_A200 = "#b2ff59";
public static String LIGHTGREEN_A400 = "#76ff03";
public static String LIGHTGREEN_A700 = "#64dd17";


///  LIME   ///
public static String LIME_50 = "#f9fbe7";
public static String LIME_100 = "#f0f4c3";
public static String LIME_200 = "#e6ee9c";
public static String LIME_300 = "#dce775";
public static String LIME_400 = "#d4e157";
public static String LIME_500 = "#cddc39";
public static String LIME_600 = "#c0ca33";
public static String LIME_700 = "#afb42b";
public static String LIME_800 = "#9e9d24";
public static String LIME_900 = "#827717";

public static String LIME_A100 = "#f4ff81";
public static String LIME_A200 = "#eeff41";
public static String LIME_A400 = "#c6ff00";
public static String LIME_A700 = "#aeea00";


///  YELLOW   ///
public static String YELLOW_50 = "#fffde7";
public static String YELLOW_100 = "#fff9c4";
public static String YELLOW_200 = "#fff59d";
public static String YELLOW_300 = "#fff176";
public static String YELLOW_400 = "#ffee58";
public static String YELLOW_500 = "#ffeb3b";
public static String YELLOW_600 = "#fdd835";
public static String YELLOW_700 = "#fbc02d";
public static String YELLOW_800 = "#f9a825";
public static String YELLOW_900 = "#f57f17";

public static String YELLOW_A100 = "#ffff8d";
public static String YELLOW_A200 = "#ffff00";
public static String YELLOW_A400 = "#ffea00";
public static String YELLOW_A700 = "#ffd600";


///  AMBER   ///
public static String AMBER_50 = "#fff8e1";
public static String AMBER_100 = "#ffecb3";
public static String AMBER_200 = "#ffe082";
public static String AMBER_300 = "#ffd54f";
public static String AMBER_400 = "#ffca28";
public static String AMBER_500 = "#ffc107";
public static String AMBER_600 = "#ffb300";
public static String AMBER_700 = "#ffa000";
public static String AMBER_800 = "#ff8f00";
public static String AMBER_900 = "#ff6f00";

public static String AMBER_A100 = "#ffe57f";
public static String AMBER_A200 = "#ffd740";
public static String AMBER_A400 = "#ffc400";
public static String AMBER_A700 = "#ffab00";


///  ORANGE   ///
public static String ORANGE_50 = "#fff3e0";
public static String ORANGE_100 = "#ffe0b2";
public static String ORANGE_200 = "#ffcc80";
public static String ORANGE_300 = "#ffb74d";
public static String ORANGE_400 = "#ffa726";
public static String ORANGE_500 = "#ff9800";
public static String ORANGE_600 = "#fb8c00";
public static String ORANGE_700 = "#f57c00";
public static String ORANGE_800 = "#ef6c00";
public static String ORANGE_900 = "#e65100";

public static String ORANGE_A100 = "#ffd180";
public static String ORANGE_A200 = "#ffab40";
public static String ORANGE_A400 = "#ff9100";
public static String ORANGE_A700 = "#ff6d00";


///  DEEPORANGE   ///
public static String DEEPORANGE_50 = "#fbe9e7";
public static String DEEPORANGE_100 = "#ffccbc";
public static String DEEPORANGE_200 = "#ffab91";
public static String DEEPORANGE_300 = "#ff8a65";
public static String DEEPORANGE_400 = "#ff7043";
public static String DEEPORANGE_500 = "#ff5722";
public static String DEEPORANGE_600 = "#f4511e";
public static String DEEPORANGE_700 = "#e64a19";
public static String DEEPORANGE_800 = "#d84315";
public static String DEEPORANGE_900 = "#bf360c";

public static String DEEPORANGE_A100 = "#ff9e80";
public static String DEEPORANGE_A200 = "#ff6e40";
public static String DEEPORANGE_A400 = "#ff3d00";
public static String DEEPORANGE_A700 = "#dd2c00";


///  BROWN   ///
public static String BROWN_50 = "#efebe9";
public static String BROWN_100 = "#d7ccc8";
public static String BROWN_200 = "#bcaaa4";
public static String BROWN_300 = "#a1887f";
public static String BROWN_400 = "#8d6e63";
public static String BROWN_500 = "#795548";
public static String BROWN_600 = "#6d4c41";
public static String BROWN_700 = "#5d4037";
public static String BROWN_800 = "#4e342e";
public static String BROWN_900 = "#3e2723";


///  GREY   ///
public static String GREY_50 = "#fafafa";
public static String GREY_100 = "#f5f5f5";
public static String GREY_200 = "#eeeeee";
public static String GREY_300 = "#e0e0e0";
public static String GREY_400 = "#bdbdbd";
public static String GREY_500 = "#9e9e9e";
public static String GREY_600 = "#757575";
public static String GREY_700 = "#616161";
public static String GREY_800 = "#424242";
public static String GREY_900 = "#212121";


///  BLUEGREY   ///
public static String BLUEGREY_50 = "#eceff1";
public static String BLUEGREY_100 = "#cfd8dc";
public static String BLUEGREY_200 = "#b0bec5";
public static String BLUEGREY_300 = "#90a4ae";
public static String BLUEGREY_400 = "#78909c";
public static String BLUEGREY_500 = "#607d8b";
public static String BLUEGREY_600 = "#546e7a";
public static String BLUEGREY_700 = "#455a64";
public static String BLUEGREY_800 = "#37474f";
public static String BLUEGREY_900 = "#263238";


///  PURE   ///
public static String PURE_White = "#FFFFFF";
public static String PURE_Black = "#000000";

public static String DARK_PrimaryText = "#87000000";
public static String DARK_SecondaryText = "#54000000";
public static String DARK_HintText = "#38000000";
public static String DARK_Divider = "#38000000";
public static String DARK_IconActive = "#54000000";
public static String DARK_IconInactive = "#38000000";

public static String LIGHT_PrimaryText = "#FFFFFF";
public static String LIGHT_SecondaryText = "#70FFFFFF";
public static String LIGHT_HintText = "#50FFFFFF";
public static String LIGHT_Divider = "#12FFFFFF";
public static String LIGHT_IconActive = "#FFFFFF";
public static String LIGHT_IconInactive = "#50FFFFFF";


///  OTHER PALETTES   ///

///  PONYO   ///
public static String PONYO_0 = "#DDEDFF";
public static String PONYO_1 = "#25387D";
public static String PONYO_2 = "#364590";
public static String PONYO_3 = "#314899";
public static String PONYO_4 = "#5483C4";
public static String PONYO_5 = "#62A0DC";
public static String PONYO_6 = "#81B4DF";
public static String PONYO_7 = "#661225";
public static String PONYO_8 = "#984364";
public static String PONYO_9 = "#B03D37";

///  KIKI   ///
public static String KIKI_0 = "#3E98A3";
public static String KIKI_1 = "#2188A8";
public static String KIKI_2 = "#1A3C70";
public static String KIKI_3 = "#1849A2";
public static String KIKI_4 = "#8E8752";
public static String KIKI_5 = "#D5D770";
public static String KIKI_6 = "#42406C";
public static String KIKI_7 = "#CBB9B2";
public static String KIKI_8 = "#2D080A";
public static String KIKI_9 = "#C23841";
   

///  SPIRITED AWAY   ///
public static String SPIRIT_0 = "#58A556";
public static String SPIRIT_1 = "#2F9A8D";
public static String SPIRIT_2 = "#022960";
public static String SPIRIT_3 = "#000000";
public static String SPIRIT_4 = "#EDE3D5";
public static String SPIRIT_5 = "#73777B";
public static String SPIRIT_6 = "#6D391C";
public static String SPIRIT_7 = "#92262F";
public static String SPIRIT_8 = "#B83D49";
public static String SPIRIT_9 = "#DF6167";

///  CASTLE IN THE SKY   ///
public static String CASTLE_0 = "#758FBF";
public static String CASTLE_1 = "#2F69C1";
public static String CASTLE_2 = "#304436";
public static String CASTLE_3 = "#4E683C";
public static String CASTLE_4 = "#78A670";
public static String CASTLE_5 = "#893836";
public static String CASTLE_6 = "#A7784C";
public static String CASTLE_7 = "#995D34";
public static String CASTLE_8 = "#E5D234";
public static String CASTLE_9 = "#DADB6D";




public static String[] colours = {"RED", "PINK", "PURPLE", 
"DEEPPURPLE", "INDIGO", "BLUE", "LIGHTBLUE", "CYAN", "TEAL", 
"GREEN", "LIGHTGREEN", "LIME", "YELLOW", "AMBER", "ORANGE", 
"DEEPORANGE", "BROWN", "GREY", "BLUEGREY"};

public static String[] anime_colours = {"PONYO", "KIKI", "SPIRIT", "CASTLE"};

public static Color getColour(String c){
    return Color.decode(c);
}

public static Color getDynamicColour(String c){

    Colours x = new Colours();
    String val = "#ffffff";
    try {
        Field field = Colours.class.getDeclaredField(c);
        val = (String) field.get(x);
    } catch (NoSuchFieldException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }

    return getColour(val);
}

}
