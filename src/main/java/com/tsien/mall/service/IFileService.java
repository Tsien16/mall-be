package com.tsien.mall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/3/31 0031 0:03
 */

public interface IFileService {

    /**
     * 上传文件
     *
     * @param file 文件
     * @param path 路径
     * @return 文件名
     */
    String upload(MultipartFile file, String path);
}
