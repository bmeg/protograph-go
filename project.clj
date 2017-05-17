(defproject protograph "0.0.3"
  :description "tranform a stream of messages into a graph"
  :url "http://github.com/bmeg/protograph"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cheshire "5.7.1"]
                 [com.taoensso/timbre "4.8.0"]
                 [io.bmeg/protograph_2.11 "0.0.1-SNAPSHOT"]
                 [clojurewerkz/propertied "1.2.0"]
                 [org.apache.kafka/kafka_2.10 "0.10.0.1" :scope "test"
                  :exclusions [io.netty/netty
                               log4j
                               org.slf4j/slf4j-api
                               org.slf4j/slf4j-log4j12]]]
  :repositories [["sonatype snapshots"
                  "https://oss.sonatype.org/content/repositories/snapshots"]
                 ["sonatype releases"
                  "https://oss.sonatype.org/content/repositories/releases"]]
  :jvm-opts ["-Xmx12g" "-Xms12g"]
  :main protograph.core)