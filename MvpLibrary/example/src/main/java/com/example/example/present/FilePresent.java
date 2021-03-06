package com.example.example.present;

import com.example.example.app.Constants;
import com.example.example.fragment.FileFragment;
import com.stone.baselib.mvp.SPresentImpl;
import com.stone.baselib.utils.SFileUtils;

/**
 * Stone
 * 2019/4/25
 **/
public class FilePresent extends SPresentImpl<FileFragment> {
    private static final String FILENAME = Constants.FILE_DIR+"stone.txt";

    public void write(String content) {
        String msg = "failed";
        if(SFileUtils.writeFile(FILENAME, content)){
            msg = "success";
        }
        getV().showToast("Write "+msg+":"+FILENAME);
    }

    public void read() {
        getV().setEtText(SFileUtils.readFile(FILENAME, "UTF-8").toString());
    }

    public void decode(String info) {
//        getV().setEtText(SDecodeUtils.bytes2Hex(SDecodeUtils.BASE64.decode(info)));
//        SDecodeUtils.RSA;SDecodeUtils.DES;
    }

    public void encode(String info) {
//        try {
//            SLogUtils.d(SDecodeUtils.hex2Bytes(SDecodeUtils.SHA.encrypt(info.getBytes())));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        getV().setEtText(SDecodeUtils.BASE64.encodeToString(info.getBytes()));
    }
}
