package kr.co.teaming.www.teaming.controller.notice.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.co.teaming.www.teaming.R;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder>{


    @Override
    public NoticeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notice, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticeAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }

    }
}
