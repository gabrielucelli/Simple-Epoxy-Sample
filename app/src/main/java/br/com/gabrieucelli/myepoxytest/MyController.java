package br.com.gabrieucelli.myepoxytest;

import android.support.v7.widget.RecyclerView;

import com.airbnb.epoxy.EpoxyController;

import java.util.ArrayList;
import java.util.List;

import br.com.gabrieucelli.myepoxytest.models.CarouselModel_;
import br.com.gabrieucelli.myepoxytest.models.HeaderModel_;
import br.com.gabrieucelli.myepoxytest.models.ItemHorizontalModel;
import br.com.gabrieucelli.myepoxytest.models.ItemHorizontalModel_;
import br.com.gabrieucelli.myepoxytest.models.ItemVerticalModel_;

/**
 * Created by Gabriel on 07/06/2017.
 */

public class MyController extends EpoxyController {


    @Override
    protected void buildModels() {

        new HeaderModel_()
                .title("Title")
                .descr("Description")
                .id(0)
                .addTo(this);

        new ItemVerticalModel_()
                .title("Vertical item 0")
                .id(1)
                .addTo(this);

        new ItemVerticalModel_()
                .title("Vertical item 1")
                .id(2)
                .addTo(this);

        new ItemVerticalModel_()
                .title("Vertical item 0")
                .id(3)
                .addTo(this);

        List<ItemHorizontalModel> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(new ItemHorizontalModel_()
                    .id(i * 10 + 100)
                    .title("Item horizontal " + i));

        new CarouselModel_()
                .id(4)
                .models(list)
                .recycledViewPool(new RecyclerView.RecycledViewPool())
                .numItemsExpectedOnDisplay(list.size())
                .addTo(this);

        new ItemVerticalModel_()
                .title("Vertical item 0")
                .id(5)
                .addTo(this);

        new ItemVerticalModel_()
                .title("Vertical item 0")
                .id(6)
                .addTo(this);

    }
}
