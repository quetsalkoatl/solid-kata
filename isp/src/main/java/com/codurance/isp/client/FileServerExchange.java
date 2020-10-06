package com.codurance.isp.client;

import java.io.File;

public interface FileServerExchange {

    void uploadFile(File file);

    File downloadFile(String path);

}
