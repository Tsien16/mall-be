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

    String upload(MultipartFile file, String path);
}
