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

@EpoxyModelClass(layout = R.layout.item_horizontal)
public abstract class ItemHorizontalModel extends EpoxyModelWithHolder<ItemHorizontalModel.ItemHorizontalHolder> {

    @EpoxyAttribute
    String title;

    @Override
    public void bind(ItemHorizontalHolder holder) {
        holder.textView.setText(title);
    }

    public static class ItemHorizontalHolder extends BaseEpoxyHolder {
        @BindView(R.id.text_horizontal)
        TextView textView;
    }
}
