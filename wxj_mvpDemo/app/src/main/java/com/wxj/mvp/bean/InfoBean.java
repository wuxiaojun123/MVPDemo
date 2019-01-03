package com.wxj.mvp.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class InfoBean {

    private int stat;

    private List<ThumbnailBean> data;

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public List<ThumbnailBean> getData() {
        if (data == null) {
            return new ArrayList<>();
        }
        return data;
    }

    public void setData(List<ThumbnailBean> data) {
        this.data = data;
    }

    public static class ThumbnailBean {
        /**
         * uniquekey : a740c47da259717839a1893a7ff07b9a
         * title : 意甲顶星表态愿来中超踢球，身价超2亿元，曾与恒大国安传绯闻
         * date : 2019-01-03 13:38
         * category : 头条
         * author_name : 体坛扒客
         * url : http://mini.eastday.com/mobile/190103133802518.html
         * thumbnail_pic_s : http://00imgmini.eastday.com/mobile/20190103/2019010313_2f25c544390d4b5985c35c985d078838_3341_mwpm_03200403.jpg
         * thumbnail_pic_s02 : http://00imgmini.eastday.com/mobile/20190103/2019010313_97b234989001439d9ec7d387639dfebc_8902_mwpm_03200403.jpg
         * thumbnail_pic_s03 : http://00imgmini.eastday.com/mobile/20190103/2019010313_c1805cacf2b745ea9d15ea5ae196463c_5453_mwpm_03200403.jpg
         */

        private String uniquekey;
        private String title;
        private String date;
        private String category;
        private String author_name;
        private String url;
        private String thumbnail_pic_s;
        private String thumbnail_pic_s02;
        private String thumbnail_pic_s03;

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getThumbnail_pic_s02() {
            return thumbnail_pic_s02;
        }

        public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
            this.thumbnail_pic_s02 = thumbnail_pic_s02;
        }

        public String getThumbnail_pic_s03() {
            return thumbnail_pic_s03;
        }

        public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
            this.thumbnail_pic_s03 = thumbnail_pic_s03;
        }
    }
}
