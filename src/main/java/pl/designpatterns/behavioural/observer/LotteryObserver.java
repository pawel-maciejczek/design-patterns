/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.observer;

import java.util.List;

/**
 *
 */
public interface LotteryObserver {

    void notifyResults(List<Integer> arrayOfNumbers);

}
