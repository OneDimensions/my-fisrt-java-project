package com.onedimension.pokerExercise;

import java.util.*;
import java.util.stream.Stream;

public class Room {
    private final List<PokerCard> pokerCards = new ArrayList<>();
    // 玩家列表
    private final Map<String, List<PokerCard>> playerList = new HashMap<>();

    {
        // 初始化斗地主扑克
        String[] size = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
        String[] colors = {"♦", "♣", "♥", "♠",};
        int weight = 0;
        for (String s : size) {
            for (String color : colors) {
                pokerCards.add(new PokerCard(s, color, weight++));
            }
        }
        System.out.println(weight);
        Collections.addAll(pokerCards, new PokerCard("BIG_JOKER", "🤡", weight++), new PokerCard("LITTLE_JOKER", "🃏", weight));
        System.out.println("初始化完成" + pokerCards);
    }

    // 启动
    public void start() {
        // 洗牌
        random();
        // 创建玩家
        initPlayers();
        // 发牌
        deal();
        // 抢地主
        grabLandlord();
        // 排序
        sort();
        // 看牌
        show();
    }

    // 抢地主
    private void grabLandlord() {
        System.out.println("开始抢地主");
        int r = (int) (Math.random() * playerList.size());
        String landlordName = playerList.keySet().toArray()[r].toString();
        System.out.println(landlordName + "抢地主成功!!!!!!");
        playerList.get(landlordName).addAll(pokerCards.subList(pokerCards.size() - 3, pokerCards.size()));
    }

    // 洗牌
    public void random() {
        Collections.shuffle(this.pokerCards);
        System.out.println("洗牌完成:" + this.pokerCards);
    }

    // 初始化玩家列表
    public void initPlayers() {
        playerList.put("玩家1", new ArrayList<>());
        playerList.put("玩家2", new ArrayList<>());
        playerList.put("玩家3", new ArrayList<>());
    }

    // 发牌
    public void deal() {
        int point = 0;
        for (int i = 0; i < pokerCards.size() - 3; i++) {
            PokerCard pokerCard = pokerCards.get(i);
            Set<String> playerKey = playerList.keySet();
            if (point == 3) point = 0;
            String key = playerKey.toArray()[point++].toString();
            // 拿到玩家对象的poker集合, 添加 poker
            playerList.get(key).add(pokerCard);
        }
        System.out.println("发牌完成:" + playerList);
        System.out.println("底牌:" + pokerCards.subList(pokerCards.size() - 3, pokerCards.size()));
    }


    // 排序
    public void sort() {
        playerList.forEach((key, playerPokers) -> {
            Collections.sort(playerPokers);
        });
        System.out.println("排序完成:" + playerList);
    }

    // 看牌
    public void show() {
        playerList.forEach((key, playerPokers) -> {
            System.out.println(key + "的牌为:" + playerPokers);
        });
    }
}
