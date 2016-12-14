package com.simank.newdemogank.Bean;

import java.util.List;

/**
 * Created by sx on 2016/12/12.
 */
public class GankBean {


    /**
     * error : false
     * results : [{"_id":"584a6b99421aa963efd90db6","createdAt":"2016-12-09T16:30:17.652Z","desc":"谷歌开发者中文博客","publishedAt":"2016-12-12T11:30:54.254Z","source":"web","type":"Android","url":"http://developers.googleblog.cn/","used":true,"who":"Stefan Cheung"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 584a6b99421aa963efd90db6
         * createdAt : 2016-12-09T16:30:17.652Z
         * desc : 谷歌开发者中文博客
         * publishedAt : 2016-12-12T11:30:54.254Z
         * source : web
         * type : Android
         * url : http://developers.googleblog.cn/
         * used : true
         * who : Stefan Cheung
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public List<String> getImages(){
            return images;

        }
        public void setImages(List<String> images){
            this.images = images;
        }


        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        @Override
        public String toString() {
            return "详细是"+desc;
        }
    }





}
