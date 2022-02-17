package com.hyphenate.easeim.common.model;

import com.hyphenate.easeim.R;
import com.hyphenate.easeui.domain.EaseEmojicon;
import com.hyphenate.easeui.domain.EaseEmojicon.Type;
import com.hyphenate.easeui.domain.EaseEmojiconGroupEntity;

import java.util.Arrays;

public class EmojiXiaoZhiData {
    
    private static int[] icons = new int[]{
        R.drawable.icon_xiaozhi_01_cover,
        R.drawable.icon_xiaozhi_02_cover,
        R.drawable.icon_xiaozhi_03_cover,
        R.drawable.icon_xiaozhi_04_cover,
        R.drawable.icon_xiaozhi_05_cover,
        R.drawable.icon_xiaozhi_06_cover,
        R.drawable.icon_xiaozhi_07_cover,
        R.drawable.icon_xiaozhi_08_cover,
        R.drawable.icon_xiaozhi_09_cover,
        R.drawable.icon_xiaozhi_10_cover,
        R.drawable.icon_xiaozhi_11_cover,
        R.drawable.icon_xiaozhi_12_cover,
        R.drawable.icon_xiaozhi_13_cover,
        R.drawable.icon_xiaozhi_14_cover,
        R.drawable.icon_xiaozhi_15_cover,
        R.drawable.icon_xiaozhi_16_cover
    };
    
    private static int[] bigIcons = new int[]{
            R.drawable.icon_xiaozhi_01,
            R.drawable.icon_xiaozhi_02,
            R.drawable.icon_xiaozhi_03,
            R.drawable.icon_xiaozhi_04,
            R.drawable.icon_xiaozhi_05,
            R.drawable.icon_xiaozhi_06,
            R.drawable.icon_xiaozhi_07,
            R.drawable.icon_xiaozhi_08,
            R.drawable.icon_xiaozhi_09,
            R.drawable.icon_xiaozhi_10,
            R.drawable.icon_xiaozhi_11,
            R.drawable.icon_xiaozhi_12,
            R.drawable.icon_xiaozhi_13,
            R.drawable.icon_xiaozhi_14,
            R.drawable.icon_xiaozhi_15,
            R.drawable.icon_xiaozhi_16
    };

    private static String[] names = new String[]{
            "拒绝",
            "收到",
            "白白",
            "cool",
            "？？？",
            "啊啊啊",
            "...",
            "谢谢你",
            "好好学习",
            "出发啦",
            "画圈圈",
            "赞",
            "暗中观察",
            "我错了",
            "早上好",
            "拜托了"
    };

    private static String[] ids = new String[]{
            "xiaozhi1",
            "xiaozhi2",
            "xiaozhi3",
            "xiaozhi4",
            "xiaozhi5",
            "xiaozhi6",
            "xiaozhi7",
            "xiaozhi8",
            "xiaozhi9",
            "xiaozhi10",
            "xiaozhi11",
            "xiaozhi12",
            "xiaozhi13",
            "xiaozhi14",
            "xiaozhi15",
            "xiaozhi16"
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
        emojiconGroupEntity.setIcon(R.drawable.icon_xiaozhi);
        emojiconGroupEntity.setType(Type.BIG_EXPRESSION);
        return emojiconGroupEntity;
    }
    
    
    public static EaseEmojiconGroupEntity getData(){
        return DATA;
    }
}
