package com.mgtv.lib.protobuf;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.util.IOUtils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * author  Li Peng on 2020/8/12.
 * Phone 18974450920
 * Mail lipeng@mgtv.com
 */
public class ProtoTest {

    public static void main(String[] args) {
        int sampleSize = 50000;
        String jsonDataPath = "C:\\LiPeng\\samples_json.txt";
        String protoDataPath = "C:\\LiPeng\\samples_proto.txt";
//        buildJsonSamples(sampleSize, jsonDataPath);
//        buildProtoBufSample(sampleSize, protoDataPath);
//
        readJsonSample(sampleSize, jsonDataPath);
        readProtoBufSample(sampleSize, protoDataPath);
    }

    private static void readProtoBufSample(int sampleSize, String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        long old = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream bos = null;
        try {
            fileInputStream = new FileInputStream(file);
            bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024]; //数据中转站 临时缓冲区
            int length = 0;
            while ((length = fileInputStream.read(buf)) != -1) {
                bos.write(buf, 0, length);
            }
            bos.flush();
            byte[] obj = bos.toByteArray();
            VideoInfoWrapper.VideoWrapper wrapper = VideoInfoWrapper.VideoWrapper.parseFrom(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileInputStream) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                }
            }
            if (null != bos) {
                try {
                    bos.close();
                } catch (IOException e) {
                }
            }
        }
        System.out.println("ProtoBuf " + sampleSize + "样本解码耗时：" + (System.currentTimeMillis() - old));
    }

    private static void readJsonSample(int sampleSize, String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        long old = System.currentTimeMillis();
        try {
            List<VideoInfo.Video> lists = new ArrayList<>();
            JSONReader reader1 = new JSONReader(new FileReader(file));
            reader1.startArray();
            while (reader1.hasNext()) {
                lists.add(reader1.readObject(VideoInfo.Video.class));
            }
            reader1.endArray();
            reader1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FastJson " + sampleSize + "样本解码耗时：" + (System.currentTimeMillis() - old));
    }

    private static void buildProtoBufSample(int sampleSize, String filePath) {
        File file = new File(filePath);
        File parent = file.getParentFile();
        if (parent == null) {
            return;
        }
        if (!parent.exists()) {
            parent.mkdirs();
        }

        if (file.exists()) {
            file.delete();
        }
        List<VideoInfo.Video> list = buildSamples(sampleSize);
        long old = System.currentTimeMillis();
        FileOutputStream fileOutputStream = null;
        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            for (VideoInfo.Video item : list) {
                item.writeTo(fileOutputStream);
            }
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileOutputStream) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                }
            }
        }
        System.out.println("ProtoBuf " + sampleSize + "样本编码耗时：" + (System.currentTimeMillis() - old));
    }

    /**
     * 创建样本，并把样本JSON序列化，保存到文件中。
     *
     * @param sampleSize 样本数量
     * @param filePath   样本输出的文件路径
     */
    private static void buildJsonSamples(int sampleSize, String filePath) {
        File file = new File(filePath);
        File parent = file.getParentFile();
        if (parent == null) {
            return;
        }
        if (!parent.exists()) {
            parent.mkdirs();
        }

        if (file.exists()) {
            file.delete();
        }
        List<VideoInfo.Video> list = buildSamples(sampleSize);
        long old = System.currentTimeMillis();
        try {
            file.createNewFile();
            JSONWriter writer = new JSONWriter(new FileWriter(file));
            writer.startArray();
            for (VideoInfo.Video item : list) {
                writer.writeObject(item);
            }
            writer.endArray();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FastJson " + sampleSize + "样本编码耗时：" + (System.currentTimeMillis() - old));
    }

    private static List<VideoInfo.Video> buildSamples(int sampleSize) {
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
        List<VideoInfo.Video> list = new ArrayList<>();
        for (int i = 0; i < sampleSize; i++) {
            list.add(video);
        }
        return list;
    }

}