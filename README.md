#Horizontalsectionlistview

Listview that scrolls horizontally with sections

#Description

This is basically an UI component which scrolls horizontally and has sections. This can be used for planner kind of UI.

#How to use ?

Import the library project and add to the project’s dependency and add Recycler View  in  gradle file

    compile 'com.android.support:appcompat-v7:22.2.0'
    compile 'com.android.support:recyclerview-v7:+'
    compile project(':horizontallistviewwithsections')
    
Create the model class for list item and sections and make them implement the interface- Item from this component

Make your RecyclerView Adapter extend HorizontalListViewWithSectionsAdapter and pass the data source to the adapter through the default constructor 

Override the RecyclerView adapter methods

Refer the sample project – HorizontalListView for binding the views in the adapter

[![ScreenShot](horizontalsectionlistview/Demo_Video/image.gif)]


