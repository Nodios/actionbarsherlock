package com.actionbarsherlock.internal.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.view.Menu;
import android.support.v4.view.MenuItem;
import android.support.v4.view.SubMenu;
import android.view.KeyEvent;

/**
 * Wrapper around a native Menu instance which implements our version of the
 * Menu interface.
 */
public class MenuWrapper implements Menu {
    /** Native menu. */
    private final android.view.Menu mMenu;

    /**
     * Create a new wrapped instance.
     *
     * @param menu Native menu.
     */
    public MenuWrapper(android.view.Menu menu) {
        this.mMenu = menu;
    }

    /**
     * Get the native menu instance we are wrapping.
     *
     * @return Native menu.
     */
    android.view.Menu unwrap() {
        return mMenu;
    }

    
    public MenuItem add(CharSequence title) {
        return new MenuItemWrapper(mMenu.add(title));
    }

    
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return new MenuItemWrapper(mMenu.add(groupId, itemId, order, titleRes));
    }

    
    public MenuItem add(int titleRes) {
        return new MenuItemWrapper(mMenu.add(titleRes));
    }

    
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return new MenuItemWrapper(mMenu.add(groupId, itemId, order, title));
    }

    
    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, android.view.MenuItem[] outSpecificItems) {
        return mMenu.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, outSpecificItems);
    }

    
    public SubMenu addSubMenu(CharSequence title) {
        return new SubMenuWrapper(mMenu.addSubMenu(title));
    }

    
    public SubMenu addSubMenu(int titleRes) {
        return new SubMenuWrapper(mMenu.addSubMenu(titleRes));
    }

    
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return new SubMenuWrapper(mMenu.addSubMenu(groupId, itemId, order, title));
    }

    
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return new SubMenuWrapper(mMenu.addSubMenu(groupId, itemId, order, titleRes));
    }

    
    public void clear() {
        mMenu.clear();
    }

    
    public void close() {
        mMenu.close();
    }

    
    public MenuItem findItem(int id) {
        android.view.MenuItem item = mMenu.findItem(id);
        return (item != null) ? new MenuItemWrapper(item) : null;
    }

    
    public MenuItem getItem(int index) {
        return new MenuItemWrapper(mMenu.getItem(index));
    }

    
    public boolean hasVisibleItems() {
        return mMenu.hasVisibleItems();
    }

    
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return mMenu.isShortcutKey(keyCode, event);
    }

    
    public boolean performIdentifierAction(int id, int flags) {
        return mMenu.performIdentifierAction(id, flags);
    }

    
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return mMenu.performShortcut(keyCode, event, flags);
    }

    
    public void removeGroup(int groupId) {
        mMenu.removeGroup(groupId);
    }

    
    public void removeItem(int id) {
        mMenu.removeItem(id);
    }

    
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        mMenu.setGroupCheckable(group, checkable, exclusive);
    }

    
    public void setGroupEnabled(int group, boolean enabled) {
        mMenu.setGroupEnabled(group, enabled);
    }

    
    public void setGroupVisible(int group, boolean visible) {
        mMenu.setGroupVisible(group, visible);
    }

    
    public void setQwertyMode(boolean isQwerty) {
        mMenu.setQwertyMode(isQwerty);
    }

    
    public int size() {
        return mMenu.size();
    }
}
