package jgqz20230821.appweb.utils;

import jakarta.servlet.ServletException;
import java.io.IOException;

public interface IAuthorize {
    void authorize() throws ServletException, IOException;
}