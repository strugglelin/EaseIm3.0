package com.hyphenate.easeim.common.model;

import com.hyphenate.easeim.R;
import com.hyphenate.easeui.domain.EaseEmojicon;
import com.hyphenate.easeui.domain.EaseEmojicon.Type;
import com.hyphenate.easeui.domain.EaseEmojiconGroupEntity;

import java.util.Arrays;

public class EmojiBoyData {
    
    private static int[] icons = new int[]{
        R.drawable.icon_boy_01_cover,
        R.drawable.icon_boy_02_cover,
        R.drawable.icon_boy_03_cover,
        R.drawable.icon_boy_04_cover,
        R.drawable.icon_boy_05_cover,
        R.drawable.icon_boy_06_cover,
        R.drawable.icon_boy_07_cover,
        R.drawable.icon_boy_08_cover,
        R.drawable.icon_boy_09_cover,
        R.drawable.icon_boy_10_cover,
        R.drawable.icon_boy_11_cover,
        R.drawable.icon_boy_12_cover,
        R.drawable.icon_boy_13_cover,
        R.drawable.icon_boy_14_cover,
        R.drawable.icon_boy_15_cover,
        R.drawable.icon_boy_16_cover,
        R.drawable.icon_boy_17_cover,
        R.drawable.icon_boy_18_cover,
        R.drawable.icon_boy_19_cover,
        R.drawable.icon_boy_20_cover,
        R.drawable.icon_boy_21_cover,
        R.drawable.icon_boy_22_cover,
        R.drawable.icon_boy_23_cover,
        R.drawable.icon_boy_24_cover
    };
    
    private static int[] bigIcons = new int[]{
            R.drawable.icon_boy_01_cover,
            R.drawable.icon_boy_02_cover,
            R.drawable.icon_boy_03_cover,
            R.drawable.icon_boy_04_cover,
            R.drawable.icon_boy_05_cover,
            R.drawable.icon_boy_06_cover,
            R.drawable.icon_boy_07_cover,
            R.drawable.icon_boy_08_cover,
            R.drawable.icon_boy_09_cover,
            R.drawable.icon_boy_10_cover,
            R.drawable.icon_boy_11_cover,
            R.drawable.icon_boy_12_cover,
            R.drawable.icon_boy_13_cover,
            R.drawable.icon_boy_14_cover,
            R.drawable.icon_boy_15_cover,
            R.drawable.icon_boy_16_cover,
            R.drawable.icon_boy_17_cover,
            R.drawable.icon_boy_18_cover,
            R.drawable.icon_boy_19_cover,
            R.drawable.icon_boy_20_cover,
            R.drawable.icon_boy_21_cover,
            R.drawable.icon_boy_22_cover,
            R.drawable.icon_boy_23_cover,
            R.drawable.icon_boy_24_cover
    };

    private static String[] names = new String[]{
            "??????",
            "NO",
            "??????",
            "bye",
            "??????",
            "??????",
            "666",
            "??????",
            "?????????",
            "biu",
            "????????????",
            "?????????",
            "?????????",
            "?????????",
            "???~",
            "???",
            "cool",
            "??????",
            "sorry",
            "??????",
            "????????????",
            "?????????",
            "???????????????",
            "????????????"
    };

    private static String[] ids = new String[]{
            "boy1",
            "boy2",
            "boy3",
            "boy4",
            "boy5",
            "boy6",
            "boy7",
            "boy8",
            "boy9",
            "boy10",
            "boy11",
            "boy12",
            "boy13",
            "boy14",
            "boy15",
            "boy16",
            "boy17",
            "boy18",
            "boy19",
            "boy20",
            "boy21",
            "boy22",
            "boy23",
            "boy24"
    };

    private static final EaseEmojiconGroupEntity DATA = createData();
    
    private static EaseEmojiconGroupEntity createData(){
        EaseEmojiconGroupEntity emojiconGroupEntity = new EaseEmojiconGroupEntity();
        EaseEmojicon[] datas = new EaseEmojicon[icons.length];
        for(int i = 0; i < icons.length; i++){
            datas[i] = new EaseEmojicon(icons[i], null, Type.BIG_EXPRESSION);
            datas[i].setBigIcon(bigIcons[i]);
            datas[i].setName(names[i]);
            datas[i].setIdentityCode(ids[i]);
        }
        emojiconGroupEntity.setEmojiconList(Arrays.asList(datas));
        emojiconGroupEntity.setIcon(R.drawable.icon_boy);
        emojiconGroupEntity.setType(Type.BIG_EXPRESSION);
        return emojiconGroupEntity;
    }
    
    
    public static EaseEmojiconGroupEntity getData(){
        return DATA;
    }
}
