�}�  �w  볢cbR� �a	��� m#o>��{0%^-���SsR��D'P~���K}�>rrb�K�o�Fq)��l^��/�Ι�-Z�Y$�܁14���&�#0�OW�U@��x��` �/�l~��	��a�z����
7�d�O�(�� _&"��Y�Լ�;^	�J��5Ƀ#o+-���hT�IJ�^�m5����v�ކ��D�<���\!���d��~�K>b�B����_�)@z��E��o�@�֥���¯9��g?���"xM���܉h�^
/��͕�Z�+����F���t	$�=b�W��g	�#ͨ���ؿ�vx�l��dG��^�P�	<D�J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l(ʹ��^��6rɂ=�{�q�h9S��wQ��-_��������������sc�m��h4���&j���x"�m�� ��m�F�WO�_��h~��T��0SݏmU��҃8�ݹ���"8
�Վ��R ��ܣ�m�#�F�&��3t�F�Z���b�n�5��8���:�ܫ���Ƴ]3���0sv��mz\�
Ԯ�V�s�4�ˢ�|~P�~�(4�`Q���FM��ǚ,0h1k`4�~-��ߙGܚ`�׷�ay��(����|�*Up!w�:L<x�=j�� �f�m�e#��`/&�P�$��{;�!�9������X_��j���}�V�9�K��|��u{.��f�"'Xk�>vX�tbK��US�O���rfmZ�5����X'1;џ�h�O����~���($3�gֱ��j��:�gP�h'\��GrknK��E�� V���;�;7��[�@�����0��#�K��R3���*M�cp!Дf�Ytm���
        //在HomeFragment的xml文件渲染成view。
        if(rootView==null) {
            rootView = mInflater.inflate(R.layout.activity_new, null);
            //返回的View即为fragment要显示的View
            tv_familyname=rootView.findViewById(R.id.tv_familyname);
            //设置家庭名称为登陆时保存的数据
            tv_familyname.setText(MyApplication.family_name);
        }
        return rootView;
    }
}
