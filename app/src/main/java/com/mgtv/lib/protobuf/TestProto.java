package com.mgtv.lib.protobuf;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * author  Li Peng on 2020/8/12.
 * Phone 18974450920
 * Mail lipeng@mgtv.com
 */
public class TestProto {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        UserInfo.User user = UserInfo.User.newBuilder()
                .setAge(18)
                .setId(12312312)
                .setPassword("fsdfsdfsdf")
                .setSex(1)
                .build();

        List<String> displays = new ArrayList<>();
        displays.add("hd");
        displays.add("fhd");
        displays.add("qhd");
        VideoInfo.Video.AttachInfo attachInfo = VideoInfo.Video.AttachInfo.newBuilder()
                .setForce(1)
                .addAllDisplays(displays)
                .addDisplays("wqhd")
                .setDisplays(0, "hdd")
                .build();
        VideoInfo.Video video = VideoInfo.Video.newBuilder()
                .setAttach(attachInfo)
                .setClipId("asd1231")
                .setClipImage("rhedftwferhgerterewr")
                .setClipName("hh kk ww")
                .build();
        int count = 10000;
        long old = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            byte[] buff = video.toByteArray();
        }
        //            System.out.println(Arrays.toString(buff));
//            System.out.println("ProtoBuf 数据长度:" + buff.length);
        System.out.println("ProtoBuf " + count + "次编码耗时：" + (System.currentTimeMillis() - old));
        old = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            byte[] bytes = JSON.toJSONBytes(video);
        }
        System.out.println("FastJson " + count + "次编码耗时：" + (System.currentTimeMillis() - old));

        old = System.currentTimeMillis();
        Gson gson = new Gson();
        for (int i = 0; i < count; i++) {
            gson.toJson(video);
        }
        System.out.println("Gson " + count + "次编码耗时：" + (System.currentTimeMillis() - old));


//        try {
//            System.out.println("-开始解码-");
//            old = System.currentTimeMillis();
//            VideoInfo.Video personOut = VideoInfo.Video.parseFrom(buff);
//            System.out.println("ProtoBuf 解码耗时：" + (System.currentTimeMillis() - old));
//        } catch (InvalidProtocolBufferException e) {
//            e.printStackTrace();
//        }

    }
}
