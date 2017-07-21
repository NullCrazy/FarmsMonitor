package cn.linghaiweiye.data.datastore.cloud.request;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by leixingguo on 2017/3/24.
 */

public class FilesToMultipartBody {

    public static MultipartBody filesToMultipartBody(Map<String, String> map, String id, List<File> files) {
        MultipartBody.Builder builder = new MultipartBody.Builder();

        for (File file : files) {
            RequestBody requestBody = RequestBody.create(MediaType.parse("image/jpg"), file);
            builder.addFormDataPart(id, file.getName(), requestBody);
        }

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), entry.getValue());
            builder.addFormDataPart(entry.getKey(), null, requestBody);
        }

        builder.setType(MultipartBody.FORM);
        return builder.build();
    }
}
