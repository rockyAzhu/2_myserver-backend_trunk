package com.newsoftvalley.myserver.rest.services;

import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;


public class XyzService {

  public Xyz get(XyzKey key) {
    return new Xyz()
        .setA(key.getA())
        .setB(key.getB())
        .setResult(key.getA() + key.getB());
  }
}
