package com.hyphenate.easeim.common.model;

import com.hyphenate.easeim.R;
import com.hyphenate.easeui.domain.EaseEmojicon;
import com.hyphenate.easeui.domain.EaseEmojicon.Type;
import com.hyphenate.easeui.domain.EaseEmojiconGroupEntity;

import java.util.Arrays;

public class EmojiQiQiData {
    
    private static int[] icons = new int[]{
        R.drawable.icon_qiqi_01_cover,
        R.drawable.icon_qiqi_02_cover,
        R.drawable.icon_qiqi_03_cover,
        R.drawable.icon_qiqi_04_cover,
        R.drawable.icon_qiqi_05_cover
    };
    
    private static int[] bigIcons = new int[]{
            R.drawable.icon_qiqi_01,
            R.drawable.icon_qiqi_02,
            R.drawable.icon_qiqi_03,
            R.drawable.icon_qiqi_04,
            R.drawable.icon_qiqi_05
    };

    private static String[] names = new String[]{
            "OK",
            "棒棒哒",
            "加油！",
            "？？？",
            "喜欢"
    };

    private static String[] ids = new String[]{
            "qiqi1",
            "qiqi2",
            "qiqi3",
            "qiqi4",
            "qiqi5"
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
        emojiconGroupEntity.setIcon(R.drawable.icon_qiqi);
        emojiconGroupEntity.setType(Type.BIG_EXPRESSION);
        return emojiconGroupEntity;
    }
    
    
    public static EaseEmojiconGroupEntity getData(){
        return DATA;
    }
}
