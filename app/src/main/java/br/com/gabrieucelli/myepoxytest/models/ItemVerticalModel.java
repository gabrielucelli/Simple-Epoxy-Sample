package br.com.gabrieucelli.myepoxytest.models;

import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;

import br.com.gabrieucelli.myepoxytest.R;
import butterknife.BindView;

/**
 * Created by Gabriel on 07/06/2017.
 */

@EpoxyModelClass(layout = R.layout.item_vertical)
public abstract class ItemVerticalModel extends EpoxyModelWithHolder<ItemVerticalModel.ItemVerticalHolder> {

    @EpoxyAttribute
    String title;

    @Override
    public void bind(ItemVerticalHolder holder) {
        holder.textView.setText(title);
    }

    public static class ItemVerticalHolder extends BaseEpoxyHolder {
        @BindView(R.id.text_vertical)
        TextView textView;
    }
}
