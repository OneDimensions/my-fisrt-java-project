package com.onedimension.moviemanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    /**
     * 影片名称
     */
    private String name;
    /**
     *  导演
     */
    private String director;
    /**
     *  演员
     */
    private String actor;
}
