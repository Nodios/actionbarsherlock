package com.actionbarsherlock.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.support.v4.view.MenuItem;
import android.support.v4.view.SubMenu;
import android.view.View;

public class SubMenuWrapper extends MenuWrapper implements SubMenu {
    /** Native sub-menu. */
    private final android.view.SubMenu mSubMenu;

    /**
     * Create a new wrapped instance.
     *
     * @param subMenu Native sub-menu.
     */
    public SubMenuWrapper(android.view.SubMenu subMenu) {
        super(subMenu);
        mSubMenu = subMenu;
    }

    /**
     * Get the native sub-menu instance we are wrapping.
     *
     * @return Native sub-menu.
     */
    android.view.SubMenu unwrap() {
        return mSubMenu;
    }

    
    public void clearHeader() {
        mSubMenu.clearHeader();
    }

    
    public MenuItem getItem() {
        return new MenuItemWrapper(mSubMenu.getItem());
    }

    
    public SubMenu setHeaderIcon(Drawable icon) {
        mSubMenu.setHeaderIcon(icon);
        return this;
    }

    
    public SubMenu setHeaderIcon(int iconRes) {
        mSubMenu.setHeaderIcon(iconRes);
        return this;
    }

    
    public SubMenu setHeaderTitle(CharSequence title) {
        mSubMenu.setHeaderTitle(title);
        return this;
    }

    
    public SubMenu setHeaderTitle(int titleRes) {
        mSubMenu.setHeaderTitle(titleRes);
        return this;
    }

    
    public SubMenu setHeaderView(View view) {
        mSubMenu.setHeaderView(view);
        return this;
    }

    
    public SubMenu setIcon(Drawable icon) {
        mSubMenu.setIcon(icon);
        return this;
    }

    
    public SubMenu setIcon(int iconRes) {
        mSubMenu.setIcon(iconRes);
        return this;
    }
}
