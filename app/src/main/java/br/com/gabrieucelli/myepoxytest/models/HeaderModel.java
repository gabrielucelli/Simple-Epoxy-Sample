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

@EpoxyModelClass(layout = R.layout.header)
public abstract class HeaderModel extends EpoxyModelWithHolder<HeaderModel.HeaderHolder> {

    @EpoxyAttribute
    String title;

    @EpoxyAttribute
    String descr;

    @Override
    public void bind(HeaderHolder holder) {
        holder.textHeader.setText(title);
        holder.textCaption.setText(descr);
    }

    public static class HeaderHolder extends BaseEpoxyHolder {
        @BindView(R.id.text_header)
        TextView textHeader;

        @BindView(R.id.text_caption)
        TextView textCaption;
    }
}