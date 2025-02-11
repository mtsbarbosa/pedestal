; Copyright 2013 Relevance, Inc.
; Copyright 2014-2022 Cognitect, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject io.pedestal/samples "0.5.4"
  :plugins [[lein-sub "0.2.3"]]
  :sub ["hello-world"
        "server-sent-events"
        "template-server"
        "cors"
        "ring-middleware"
        "server-with-links"])
