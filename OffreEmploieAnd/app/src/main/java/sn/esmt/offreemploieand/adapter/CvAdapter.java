package sn.esmt.offreemploieand.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;

import sn.esmt.offreemploieand.R;
import sn.esmt.offreemploieand.model.CvEntities;


public class CvAdapter extends BaseAdapter {

    private ArrayList<CvEntities> accueil;
    private LayoutInflater myInflater;

    public CvAdapter(Context context, ArrayList<CvEntities> accueil) {
        this.myInflater = LayoutInflater.from(context);
        this.accueil = accueil;
    }

    @Override
    public int getCount() {
        return this.accueil.size();
    }

    @Override
    public Object getItem(int arg0) {
        return this.accueil.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        TextView textid;
        TextView textemail;
        TextView textadresse;

        TextView textnom;
        TextView textprenom;
        TextView textage;
        TextView texttelephone;
        TextView textspecialite;
        TextView textniveauEtude;
        TextView textexperienceProfessionnelle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = myInflater.inflate(R.layout.list_cv_item, null);
            holder = new ViewHolder();
            holder.textemail = (TextView) convertView.findViewById(R.id.cvListItem_email);
            holder.textadresse = (TextView) convertView.findViewById(R.id.cvListItem_adresse);
            holder.textnom = (TextView) convertView.findViewById(R.id.cvListItem_nom);
            holder.textprenom = (TextView) convertView.findViewById(R.id.cvListItem_prenom);
            holder.textage = (TextView) convertView.findViewById(R.id.cvListItem_age);
            holder.texttelephone = (TextView) convertView.findViewById(R.id.cvListItem_telephone);
            holder.textspecialite = (TextView) convertView.findViewById(R.id.cvListItem_specialite);
            holder.textniveauEtude = (TextView) convertView.findViewById(R.id.cvListItem_niveau);
            holder.textexperienceProfessionnelle = (TextView) convertView.findViewById(R.id.cvListItem_experience);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textemail.setText(accueil.get(position).getEmail());
        holder.textadresse.setText(accueil.get(position).getAdresse());
        holder.textnom.setText(accueil.get(position).getNom());
        holder.textprenom.setText(accueil.get(position).getPrenom());
        holder.textage.setText(accueil.get(position).getAge() + "");
        holder.texttelephone.setText(accueil.get(position).getTelephone());
        holder.textspecialite.setText(accueil.get(position).getSpecialite());
        holder.textniveauEtude.setText(accueil.get(position).getNiveauEtude());
        holder.textexperienceProfessionnelle.setText(accueil.get(position).getExperienceProfessionnelle());

        return convertView;

    }
}
