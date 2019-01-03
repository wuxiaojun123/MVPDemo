package com.wxj.mvp.bean;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class WeacherBean {

    private SK sk;

    private Today today;

    private Future future;

    public SK getSk() {
        return sk;
    }

    public void setSk(SK sk) {
        this.sk = sk;
    }

    public Today getToday() {
        return today;
    }

    public void setToday(Today today) {
        this.today = today;
    }

    public Future getFuture() {
        return future;
    }

    public void setFuture(Future future) {
        this.future = future;
    }

    public static class SK {

        /**
         * temp : -1
         * wind_direction : 东风
         * wind_strength : 2级
         * humidity : 36%
         * time : 17:11
         */

        private String temp;
        private String wind_direction;
        private String wind_strength;
        private String humidity;
        private String time;

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getWind_direction() {
            return wind_direction;
        }

        public void setWind_direction(String wind_direction) {
            this.wind_direction = wind_direction;
        }

        public String getWind_strength() {
            return wind_strength;
        }

        public void setWind_strength(String wind_strength) {
            this.wind_strength = wind_strength;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static class Today {

        /**
         * temperature : -7℃~2℃
         * weather : 霾
         * weather_id : {"fa":"53","fb":"53"}
         * wind : 西南风微风
         * week : 星期四
         * city : 北京
         * date_y : 2019年01月03日
         * dressing_index : 冷
         * dressing_advice : 天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。
         * uv_index : 最弱
         * comfort_index :
         * wash_index : 不宜
         * travel_index : 较不宜
         * exercise_index : 较不宜
         * drying_index :
         */

        private String temperature;
        private String weather;
        private WeatherIdBean weather_id;
        private String wind;
        private String week;
        private String city;
        private String date_y;
        private String dressing_index;
        private String dressing_advice;
        private String uv_index;
        private String comfort_index;
        private String wash_index;
        private String travel_index;
        private String exercise_index;
        private String drying_index;

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public WeatherIdBean getWeather_id() {
            return weather_id;
        }

        public void setWeather_id(WeatherIdBean weather_id) {
            this.weather_id = weather_id;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDate_y() {
            return date_y;
        }

        public void setDate_y(String date_y) {
            this.date_y = date_y;
        }

        public String getDressing_index() {
            return dressing_index;
        }

        public void setDressing_index(String dressing_index) {
            this.dressing_index = dressing_index;
        }

        public String getDressing_advice() {
            return dressing_advice;
        }

        public void setDressing_advice(String dressing_advice) {
            this.dressing_advice = dressing_advice;
        }

        public String getUv_index() {
            return uv_index;
        }

        public void setUv_index(String uv_index) {
            this.uv_index = uv_index;
        }

        public String getComfort_index() {
            return comfort_index;
        }

        public void setComfort_index(String comfort_index) {
            this.comfort_index = comfort_index;
        }

        public String getWash_index() {
            return wash_index;
        }

        public void setWash_index(String wash_index) {
            this.wash_index = wash_index;
        }

        public String getTravel_index() {
            return travel_index;
        }

        public void setTravel_index(String travel_index) {
            this.travel_index = travel_index;
        }

        public String getExercise_index() {
            return exercise_index;
        }

        public void setExercise_index(String exercise_index) {
            this.exercise_index = exercise_index;
        }

        public String getDrying_index() {
            return drying_index;
        }

        public void setDrying_index(String drying_index) {
            this.drying_index = drying_index;
        }

        public static class WeatherIdBean {
            /**
             * fa : 53
             * fb : 53
             */

            private String fa;
            private String fb;

            public String getFa() {
                return fa;
            }

            public void setFa(String fa) {
                this.fa = fa;
            }

            public String getFb() {
                return fb;
            }

            public void setFb(String fb) {
                this.fb = fb;
            }
        }
    }


    public static class Future {

        /**
         * day_20190103 : {"temperature":"-7℃~2℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"西南风微风","week":"星期四","date":"20190103"}
         * day_20190104 : {"temperature":"-6℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","date":"20190104"}
         * day_20190105 : {"temperature":"-8℃~1℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东北风微风","week":"星期六","date":"20190105"}
         * day_20190106 : {"temperature":"-7℃~3℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期日","date":"20190106"}
         * day_20190107 : {"temperature":"-7℃~3℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期一","date":"20190107"}
         * day_20190108 : {"temperature":"-7℃~3℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期二","date":"20190108"}
         * day_20190109 : {"temperature":"-7℃~3℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期三","date":"20190109"}
         */

        private Day20190103Bean day_20190103;
        private Day20190104Bean day_20190104;
        private Day20190105Bean day_20190105;
        private Day20190106Bean day_20190106;
        private Day20190107Bean day_20190107;
        private Day20190108Bean day_20190108;
        private Day20190109Bean day_20190109;

        public Day20190103Bean getDay_20190103() {
            return day_20190103;
        }

        public void setDay_20190103(Day20190103Bean day_20190103) {
            this.day_20190103 = day_20190103;
        }

        public Day20190104Bean getDay_20190104() {
            return day_20190104;
        }

        public void setDay_20190104(Day20190104Bean day_20190104) {
            this.day_20190104 = day_20190104;
        }

        public Day20190105Bean getDay_20190105() {
            return day_20190105;
        }

        public void setDay_20190105(Day20190105Bean day_20190105) {
            this.day_20190105 = day_20190105;
        }

        public Day20190106Bean getDay_20190106() {
            return day_20190106;
        }

        public void setDay_20190106(Day20190106Bean day_20190106) {
            this.day_20190106 = day_20190106;
        }

        public Day20190107Bean getDay_20190107() {
            return day_20190107;
        }

        public void setDay_20190107(Day20190107Bean day_20190107) {
            this.day_20190107 = day_20190107;
        }

        public Day20190108Bean getDay_20190108() {
            return day_20190108;
        }

        public void setDay_20190108(Day20190108Bean day_20190108) {
            this.day_20190108 = day_20190108;
        }

        public Day20190109Bean getDay_20190109() {
            return day_20190109;
        }

        public void setDay_20190109(Day20190109Bean day_20190109) {
            this.day_20190109 = day_20190109;
        }

        public static class Day20190103Bean {
            /**
             * temperature : -7℃~2℃
             * weather : 霾
             * weather_id : {"fa":"53","fb":"53"}
             * wind : 西南风微风
             * week : 星期四
             * date : 20190103
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 53
                 * fb : 53
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190104Bean {
            /**
             * temperature : -6℃~2℃
             * weather : 晴
             * weather_id : {"fa":"00","fb":"00"}
             * wind : 北风3-5级
             * week : 星期五
             * date : 20190104
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanX {
                /**
                 * fa : 00
                 * fb : 00
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190105Bean {
            /**
             * temperature : -8℃~1℃
             * weather : 多云
             * weather_id : {"fa":"01","fb":"01"}
             * wind : 东北风微风
             * week : 星期六
             * date : 20190105
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanXX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanXX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanXX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanXX {
                /**
                 * fa : 01
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190106Bean {
            /**
             * temperature : -7℃~3℃
             * weather : 晴转多云
             * weather_id : {"fa":"00","fb":"01"}
             * wind : 西南风微风
             * week : 星期日
             * date : 20190106
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanXXX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanXXX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanXXX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanXXX {
                /**
                 * fa : 00
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190107Bean {
            /**
             * temperature : -7℃~3℃
             * weather : 多云
             * weather_id : {"fa":"01","fb":"01"}
             * wind : 北风微风
             * week : 星期一
             * date : 20190107
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanXXXX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanXXXX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanXXXX {
                /**
                 * fa : 01
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190108Bean {
            /**
             * temperature : -7℃~3℃
             * weather : 晴转多云
             * weather_id : {"fa":"00","fb":"01"}
             * wind : 西南风微风
             * week : 星期二
             * date : 20190108
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanXXXXX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanXXXXX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanXXXXX {
                /**
                 * fa : 00
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class Day20190109Bean {
            /**
             * temperature : -7℃~3℃
             * weather : 晴转多云
             * weather_id : {"fa":"00","fb":"01"}
             * wind : 西南风微风
             * week : 星期三
             * date : 20190109
             */

            private String temperature;
            private String weather;
            private WeatherIdBeanXXXXXX weather_id;
            private String wind;
            private String week;
            private String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanXXXXXX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanXXXXXX {
                /**
                 * fa : 00
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }
    }

}
