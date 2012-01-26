package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.view.View;

public interface SubMenu extends android.view.SubMenu, Menu {
    
    MenuItem add(CharSequence title);

    
    MenuItem add(int groupId, int itemId, int order, int titleRes);

    
    MenuItem add(int titleRes);

    
    MenuItem add(int groupId, int itemId, int order, CharSequence title);

    
    SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title);

    
    SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes);

    
    SubMenu addSubMenu(CharSequence title);

    
    SubMenu addSubMenu(int titleRes);

    
    MenuItem findItem(int id);

    
    MenuItem getItem(int index);

    
    MenuItem getItem();

    
    SubMenu setHeaderIcon(Drawable icon);

    
    SubMenu setHeaderIcon(int iconRes);

    
    SubMenu setHeaderTitle(CharSequence title);

    
    SubMenu setHeaderTitle(int titleRes);

    
    SubMenu setHeaderView(View view);

    
    SubMenu setIcon(Drawable icon);

    
    SubMenu setIcon(int iconRes);
}
