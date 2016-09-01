/*
 * This file is part of Siebe Projects samples.
 *
 * Siebe Projects samples is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Siebe Projects samples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with Siebe Projects samples.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.siebeprojects.samples.keyboardheight;

/**
 * The observer that will be notified when the height of 
 * the keyboard has changed
 */
public interface KeyboardHeightObserver {

    /** 
     * Called when the keyboard height has changed, if fullScreen is true when
     * height must be 0.
     * 
     * @param fullScreen    indicates that the screen is in fullscreen mode 
     * @param height        The height of the keyboard
     */
    void onKeyboardHeightChanged(boolean fullScreen, int height);
}