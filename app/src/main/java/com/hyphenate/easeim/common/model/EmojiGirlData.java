package com.hyphenate.easeim.common.model;

import com.hyphenate.easeim.R;
import com.hyphenate.easeui.domain.EaseEmojicon;
import com.hyphenate.easeui.domain.EaseEmojicon.Type;
import com.hyphenate.easeui.domain.EaseEmojiconGroupEntity;

import java.util.Arrays;

public class EmojiGirlData {
    
    private static int[] icons = new int[]{
        R.drawable.icon_girl_01_cover,
        R.drawable.icon_girl_02_cover,
        R.drawable.icon_girl_03_cover,
        R.drawable.icon_girl_04_cover,
        R.drawable.icon_girl_05_cover,
        R.drawable.icon_girl_06_cover,
        R.drawable.icon_girl_07_cover,
        R.drawable.icon_girl_08_cover,
        R.drawable.icon_girl_09_cover,
        R.drawable.icon_girl_10_cover,
        R.drawable.icon_girl_11_cover,
        R.drawable.icon_girl_12_cover,
        R.drawable.icon_girl_13_cover,
        R.drawable.icon_girl_14_cover,
        R.drawable.icon_girl_15_cover,
        R.drawable.icon_girl_16_cover
    };
    
    private static int[] bigIcons = new int[]{
            R.drawable.icon_girl_01_cover,
            R.drawable.icon_girl_02_cover,
            R.drawable.icon_girl_03_cover,
            R.drawable.icon_girl_04_cover,
            R.drawable.icon_girl_05_cover,
            R.drawable.icon_girl_06_cover,
            R.drawable.icon_girl_07_cover,
            R.drawable.icon_girl_08_cover,
            R.drawable.icon_girl_09_cover,
            R.drawable.icon_girl_10_cover,
            R.drawable.icon_girl_11_cover,
            R.drawable.icon_girl_12_cover,
            R.drawable.icon_girl_13_cover,
            R.drawable.icon_girl_14_cover,
            R.drawable.icon_girl_15_cover,
            R.drawable.icon_girl_16_cover
    };

    private static String[] names = new String[]{
            "可怕",
            "呜呜",
            "撒花",
            "喝一杯",
            "乏了",
            "喂我在",
            "爱你呦",
            "我错了",
            "拿出小本本",
            "哼~",
            "不可爱么",
            "委屈",
            "开心",
            "什么",
            "请回答",
            "无奈"
    };

    private static String[] ids = new String[]{
            "girl1",
            "girl2",
            "girl3",
            "girl4",
            "girl5",
            "girl6",
            "girl7",
            "girl8",
            "girl9",
            "girl10",
            "girl11",
            "girl12",
            "girl13",
            "girl14",
            "girl15",
            "girl16"
    };

    private static final EaseEmojiconGroupEntity DATA = createData();
    
    private static EaseEmojiconGroupEntity createData(){
        EaseEmojiconGroupEntity emojiconGroupEntity = new EaseEmojiconGroupEntity();
        EaseEmojicon[] datas = new EaseEmojicon[icons.length];
        for(int i = 0; i < icons.length; i++){
            datas[i] = new EaseEmojicon(icons[i], null, Type.BIG_EXPRESSION);
            datas[i].setBigIcon(bigIcons[i]);
            datas[i].setName(names[i]);
            datas[i].setIdentityCode("girl"+ i);
        }
        emojiconGroupEntity.setEmojiconList(Arrays.asList(datas));
        emojiconGroupEntity.setIcon(R.drawable.icon_girl);
        emojiconGroupEntity.setType(Type.BIG_EXPRESSION);
        return emojiconGroupEntity;
    }
    
    
    public static EaseEmojiconGroupEntity getData(){
        return DATA;
    }
}
